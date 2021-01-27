package com.dawang.introjava.comprehensive;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Page 64
 * 程序清单21-7
 */
public class CountKeywords {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a java soure file: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        if(file.exists()){
            System.out.println("The number of keywords in " + fileName
            +" is " + countKeywords(file));
        }else{
            System.out.println("File " +fileName+" does not exist" );
        }

    }

    public static int countKeywords(File file) throws  Exception{
        String[] keywordString = {
                "abstract","assert","boolean","break","byte","case",
                "catch","char","class","const","continue","default","do",
                "double","else","enum","extends","for","final","finally",
                "float","goto","if","implements","import","instanceof","int",
                "interface","long","native","new","package","private","protected",
                "public","return","short","static","stricfp","super","switch","synchronized",
                "this","throw","throws","transient","try","void","volatile","while",
                "true","false","null"};
        //将所有的关键词保存在一个HashSet中并使用contains来测试一个单词是否在关键字集合里
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String keyword = input.next();
            if(keywordSet.contains(keyword))
                count++;
        }
    return count;
    }
}
