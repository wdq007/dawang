package com.dawang.introjava.comprehensive.demo;

import java.io.*;

public class DawangArrayObjectStream {

    public static void main(String[] args) throws ClassNotFoundException, IOException{
        String dataFile = "/Users/apple/Downloads/temp_dawang.dat";

        int[] intArray = {1,2,3,4,5,6,7,8,9};
        String[] strArray = {"wang", "da", "quan"};


        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(dataFile,true));

                ){
            output.writeObject(intArray);
            output.writeObject(strArray);

        }


        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(dataFile));
        ){
            int[] newIntArray = (int[]) input.readObject();
            String[] newStrArray = (String[]) input.readObject();
            for (int i:newIntArray){
                System.out.println(i);
            }
            for(String s:newStrArray){
                System.out.println(s);
            }

        }
    }
}
