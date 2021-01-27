package com.dawang.introjava.comprehensive;

/**
 * 程序清单19-1
 * 封装了栈的存储， 并提供该栈的操作。
 * @param <E>
 */
//为了定义一个类为泛型类型， 需要将泛型类型放在类名之后。
public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }


    public E peek(){
        return list.get(getSize()-1);

    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "Stack:"+list.toString();
    }



}
