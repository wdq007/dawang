package com.dawang.introjava.comprehensive;


import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Page69
 * 程序清单21-9
 * 映射表中所有值必须存储为对象
 */
public class CountOccurrenceOfWords {

    public static void main(String[] args){
        String text = "Good Morning, have a good class. "+
                "Have a good visit. Have fun!";

        Map<String,Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?(){}]");
        for(int i = 0;i<words.length;i++){
            String key = words[i].toLowerCase();
            if(key.length() >0){
                if(!map.containsKey(key)){
                    map.put(key,1);
                }else{
                    int value = map.get(key);
                    value++;
                    map.put(key,value);
                }
            }
        }

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}
