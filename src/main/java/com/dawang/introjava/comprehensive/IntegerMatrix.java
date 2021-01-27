package com.dawang.introjava.comprehensive;


/**
 * Page 17
 * 程序清单 19-11
 */
public class IntegerMatrix extends GenericMatix<Integer>{
    @Override
    protected  Integer add(Integer o1,Integer o2){
        return o1 + o2;

    }

    @Override
    protected Integer multiply(Integer o1,Integer o2){
        return o1 * o2;
    }

    @Override
    protected Integer zero(){
        return 0;
    }
}
