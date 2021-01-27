package com.dawang.introjava.comprehensive;

import java.util.Stack;

/**
 * 程序清单20-9 栈可以用于表达式求值
 */

public class EvaluateExpression {

    public static void main(String[] args){

        if(args.length != 1){
            System.out.println(
                    "Usage: java Evaluate Expression \"expression\" ");
            System.exit(1);
        }

        try{
            System.out.println(evaluateExpression(args[0]));
        }catch (Exception e){
            System.out.println("Wrong Expression: " +args[0]);
        }


    }

    public static int evaluateExpression(String expression){
        Stack<Integer> operandStack = new Stack<>();//存储操作数
        Stack<Character> operatorStack = new Stack<>();//存储操作符

        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");

        for(String token:tokens){
            if(token.length()== 0)
                continue; //标记为空就跳过
            else if(token.charAt(0) == '+' || token.charAt(0) == '-'){
                while(!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+'||  //返回栈顶元素
                                operatorStack.peek() == '-'||
                        operatorStack.peek() == '*'||
                        operatorStack.peek() == '/')){
                    processAnOperator(operandStack,operatorStack);

                }
                operatorStack.push(token.charAt(0));

            }else if(token.charAt(0) == '*' || token.charAt(0) == '/'){
                while(!operatorStack.isEmpty() && (
                        operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')
                        ){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }else if(token.trim().charAt(0) == '('){ //如果标记是"（"则压入栈顶
                operatorStack.push('(');
            }else if(token.trim().charAt(0) == ')'){ //如果标记是"）"， 则处理来自栈顶顶所有元素
                while(operatorStack.peek() != '('){ //直到看到 "（"
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.pop(); //然后从栈中弹出"）"
            }else{//如果标记是操作数就压入栈顶
                operandStack.push(new Integer(token));
            }
        }
        while (!operatorStack.isEmpty()){
            processAnOperator(operandStack,operatorStack);
        }

        return operandStack.pop();


    }
    //弹出一个操作符和两个操作数用于运算，并将结果压回操作数栈
    public static void processAnOperator(Stack<Integer> operandStack,
                                          Stack<Character> operatorStack){
        char op = operatorStack.pop();
        int op1 = operandStack.pop(); //返回并移除栈顶元素
        int op2 = operandStack.pop();
        if(op == '+'){
            operandStack.push(op2 + op1); //压入新元素到栈顶
        }else if(op == '-'){
            operandStack.push(op2 - op1);
        }else if(op == '*'){
            operandStack.push(op2 * op1);
        }else if(op == '/'){
            operandStack.push(op2 / op1);
        }



    }


    //保证操作数和操作符以及括号至少被一个空格分隔
    public static String insertBlanks(String s){
        String result = "";

        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'||
            s.charAt(i) == '+' || s.charAt(i) == '-' ||
            s.charAt(i) == '*' || s.charAt(i) == '/'){
                result += " " +s.charAt(i) +" ";

            }else{
              result += s.charAt(i);
            }
        }
        return result;
    }
}
