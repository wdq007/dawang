package com.dawang.introjava.comprehensive.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DawangIO {

    public static void main(String[] args) throws IOException {

        try(FileOutputStream output = new FileOutputStream("/Users/apple/Downloads/tem.dat");

                ){
            for(int i =0;i<10;i++){
                output.write(i);
            }


         try(
                 FileInputStream input =  new FileInputStream("/Users/apple/Downloads/tem.dat");
                 ){
             int value;
             while((value = input.read()) != -1){
                 System.out.print(value +" ");
             }
         }

        }
    }
}
