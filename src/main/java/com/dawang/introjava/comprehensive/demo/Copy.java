package com.dawang.introjava.comprehensive.demo;

import java.io.*;

public class Copy {


    public static void main(String[] args) throws IOException{
        if(args.length != 2){
            System.out.println("Usage");
            System.exit(255);
        }

        File sourceFile = new File(args[0]);
        if(! sourceFile.exists()){
            System.out.println("Source File does not exist: "+args[0]);
            System.exit(127);
        }

        File targetFile = new File(args[1]);
        if( targetFile.exists()){
            System.out.println("TargeFile already exist: "+ args[1]);
            System.exit(127);
        }


        try(
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));


        ){
            int r, numberOfBytesCopied = 0;
            while((r = input.read()) != -1){
                output.write((byte) r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied+" Bytes copied");

        }

    }
}
