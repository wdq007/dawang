package com.dawang.introjava.comprehensive;


/**
 * Page 11 - 15 for revisit
 * 程序清单19-9
 *
 * 编译器可使用泛型信息，但是这些信息在运行是不可用， 被称为类型消除(type erasure)
 * 泛型只存在于编译时，一旦编译器确认泛型类型是安全使用的， 就会转换为原始类型
 * 当编译泛型类，接口和方法时，编译器用Object代替泛型类型，如果是受限的泛型类型，，编译器用该受限类型来替换
 * 泛型类的限制
 * 不能使用泛型类型创建实例, 错误：E Object = new E();
 * 不能使用泛型类型创建数组  错误：E[] element = new E[capacity];正确: E[] element = (E[]) new Object[capacity];
 * 静态上下文中不允许类的参数是泛型类型的
 * 异常类不能是泛型的，泛型类不能扩展java.lang.throwable
 *
 */
public class SuperWildCardDemo {
    public static void main(String[] args){
        GenericStack<String> strStack = new GenericStack<>();
        GenericStack<Object> objStack = new GenericStack<>();
        GenericStack<Integer> intStack = new GenericStack<>();

        objStack.push("Java");
        objStack.push(2);
        strStack.push("Sun");
        intStack.push(-100);

        lowerBoundedAdd(strStack,objStack);
        boundedAdd(intStack,objStack);
        AnyWildCardDemo.print(objStack);


    }
    //<? super T> 表示类型T或T的父类型， Object是String的父类型
    public static <T> void lowerBoundedAdd(GenericStack<T> stack1,GenericStack<? super T> stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    public static <T> void boundedAdd(GenericStack<? extends T> stack1,GenericStack<T> stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

    }


}
