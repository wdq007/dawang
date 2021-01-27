package com.dawang.introjava.comprehensive.demo;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

    public static void main(String[] args){

        System.out.println("Please enter a directory or a file:");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        System.out.println(getSize(new File(directory))+"bytes");

    }

    public static long getSize(File file){

      long size = 0;
      if(file.isDirectory()){
          File[] content = file.listFiles();
          for(int i=0;content != null && i<content.length;i++){
              size += getSize(content[i]);

          }
      }else{
          size += file.length();
      }

      return size;

    }
}
