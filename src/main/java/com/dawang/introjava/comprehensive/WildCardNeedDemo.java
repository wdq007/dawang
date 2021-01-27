package com.dawang.introjava.comprehensive;

/**
 * Page 10
 * 程序清单19-7
 */
public class WildCardNeedDemo {


    public static void main(String[] args){
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        System.out.print("The max number is "+max(intStack));

    }
    //通配泛型：? 非受限通配,? extends T 受限通配, ? super T 下限通配
    public static double max(GenericStack<? extends Number> stack){//<? extends Number>表示Number或Number的子类型的通配类型
        double max = stack.pop().doubleValue();
        while(!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if(value > max){
                max = value;
            }
        }
        return max;

    }


}
