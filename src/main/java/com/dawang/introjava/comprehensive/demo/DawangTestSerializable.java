package com.dawang.introjava.comprehensive.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DawangTestSerializable {
     public static void main(String[] args) throws IOException{
         String dataFile = "/Users/apple/Downloads/temp_dawang.dat";
         try(ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(dataFile))){
             ouput.writeObject(new A());

         }


     }

}



class A implements Serializable{
    B b = new B();
}

class B implements Serializable{

}
