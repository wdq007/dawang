package com.dawang.introjava.comprehensive.demo;

import java.io.*;

public class DawangEOF {

    public static void main(String[] args) {
        String dataFile = "/Users/apple/Downloads/tem.dat";

        try{
            try(DataOutputStream output = new DataOutputStream(new FileOutputStream(dataFile));){
                output.writeDouble(0.1);
                output.writeDouble(0.2);
                output.writeDouble(0.3);
            }

        try(DataInputStream input = new DataInputStream(new FileInputStream(dataFile));){
            while(true){
                System.out.println(input.readDouble());
            }
        }


        }catch(EOFException e){
            System.out.println("All content has been read");
            //e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
