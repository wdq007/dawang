package com.dawang.introjava.comprehensive;


/**
 * Page 11
 * 程序清单19-8
 *
 */
public class AnyWildCardDemo {
    public static void main(String[] args){

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        print(intStack);

    }

    public static void print(GenericStack<?> stack){ //<?>是个通配符， 表示任何一种对象， 等价于<? extends Object>
                                                     //但是用GenericStack<Object> 替换GenericStack<?> ， print(intStack)会出错
                                                     //因为intStack不是GenericStack<Object>的实例。
                                                     //尽管Integer是Object的一个子类型，但是enericStack<Integer> 不是GenericStack<Object>的子类型
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
