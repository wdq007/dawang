package com.dawang.introjava.comprehensive.demo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class DawangTestExists {

    public static void main(String[] args)  {

        try(
                RandomAccessFile rnd = new RandomAccessFile("test.log","r");
                ){
            System.out.println(rnd.readInt());

        }catch(IOException e){
            System.out.println("IOEXception");
        }


    }
}
