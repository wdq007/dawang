package com.dawang.introjava.comprehensive.demo;

import java.io.*;

public class DawangDataStream {

    public static void main(String[] args) throws IOException{
        String dataFile = "/Users/apple/Downloads/tem.dat";
        InputStream in;
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream(dataFile));
        ){
            output.writeUTF("dawang");
            //output.writeBoolean(True);
            output.writeDouble(0.84);


        }

        try(DataInputStream input = new DataInputStream(new FileInputStream(dataFile));
        ){
            System.out.println(input.readUTF() +" " + input.readDouble());
        }
    }
}
