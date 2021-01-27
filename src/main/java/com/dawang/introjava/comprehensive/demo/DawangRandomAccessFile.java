package com.dawang.introjava.comprehensive.demo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class DawangRandomAccessFile {


    public static void main(String[] args) throws IOException

    {
        String dataFile = "/Users/apple/Downloads/temp_dawang.dat";

        try(RandomAccessFile rnd = new RandomAccessFile(dataFile,"rw");

               ){
           System.out.println(rnd.readInt());
           rnd.setLength(0);

           for (int i=0;i<200;i++){
               rnd.writeInt(i);
           }

           System.out.println("Currnet length "+rnd.length());

           rnd.seek(0);
           System.out.println("The first number is "+rnd.readInt());


           rnd.seek(1*4);
           System.out.println("The 2nd Number is "+ rnd.readInt());

           rnd.seek(9*4);
           System.out.println("The 9th Number is "+ rnd.readInt());


           rnd.writeInt(555);

           rnd.seek(rnd.length());
           rnd.writeInt(999);
           System.out.println("The new Length is "+ rnd.length());

           rnd.seek(10*4);
           System.out.println("The 11th number is "+rnd.readInt());


       }


    }
}
