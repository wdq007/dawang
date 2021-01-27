package com.dawang.introjava.comprehensive.demo;

import java.io.*;
import java.util.Date;

public class DawangObjectStream {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String dataFile = "/Users/apple/Downloads/tem.dat";
        try(
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(dataFile));

                ){

            output.writeUTF("王大权");
            output.writeDouble(0.09);
            output.writeObject(new Date());

        }

        try(
                ObjectInputStream input = new ObjectInputStream( new BufferedInputStream(new FileInputStream(dataFile)));

                ){
            String name = input.readUTF();
            double money = input.readDouble();
            Date date = (Date) (input.readObject());
            System.out.println(name + " " + money +" " + date);

        }


    }
}



