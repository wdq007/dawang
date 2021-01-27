package com.dawang.introjava.comprehensive;

import java.io.ObjectOutputStream;

/**
 * Page 447
 * 程序清单 13-13 Rational 类，用于表示和处理有理數
 * 有理数有一个分子和分母，形式为 a/b, 这里的 a 是分子而 b 是分母。例如，1/3、3/4和10/4都是有理数。
 * 有理数的分母不能为0,但是分子可以为0。
 * 有理数用于涉及分数的准确计算，例如，1/3 0.33333...。这个数字不能用 double 或 float 数据类型精确地表示为浮点形式。
 * 为了获取准确的结果，必须使用有理数。
 * Java 提供了表示整数和浮点数的数据类型，但是没有提供表示有理数的数据类型。
 * 有理数共享了很多整数和浮点数的通用特性，Number 是数值包装类的根类，将 Rational 类定义为 Number 类的子类是合适的。
 * 因为有理数是可以比较的，所以Rational 类应该也能实现 Comparable 接口。
 * — 个有理数包括一个分子和一个分母。有很多有理数是等价的，例如，1/3=2/6=3/9
 * 1/3 的分子和分母除了1 之外没有公约数，所以，1/3 称为最简形式。
 * 为了将一个有理数约减为它的最低形式，需要找到分子和分母绝对值的最大公约數(GCD),然后将分子和分母都除以这个值。
 */
public class Rational extends Number implements Comparable<Rational>{
    //Rational 类有较为严格的限制，容易溢出。可以使用 Biglnteger 表示分子和分母来实现 Rational 类.(参见编程练习题 13.15 )
    //类的教据域应该保持私有，以确保将类的实现和类的使用分隔开
    private long numerator = 0;
    private long denominator = 1;

    public Rational(){
        this(0,1);
    }

    public Rational(long numerator,long denominator){
        long gcd = gcd(numerator,denominator);
        //一个有理数表示为它的最简形式
        this.numerator = ((denominator>0)? 1 : -1) * numerator/ gcd; //分子决定有理数的符号
        this.denominator = Math.abs(denominator)/gcd; //分母总是正数

    }
    //gcd() 方法,是私有的，它是不能被其他客户程序使用的,只能在 Rational 类的内部使用。gcd() 方法也是静态的
    private static long gcd(long n,long d){
        long n1 = Math.abs(n); //abs( x) 方法,在 Math 类中定义，并返回 x 的绝对值
        long n2 = Math.abs(d);
        int gcd = 1;
        for(int k=1;k<= n1 && k<= n2;k++){
            if(n1 % k ==0 && n2 % k ==0){
                gcd = k;
            }
        }
        return gcd;

    }
    //在 Rational 类中提供了属性 numerator (分子)和 denominator (分母)的 get 方 法，
    // 但是没有提供 set 方法，因此，一旦创建 Rational 对象，那么它的内容就不能改变。
    //Rational 类是不可变的。String 类和基本类型值的包装类也都是不可变的。
    public  long getNumerator(){
        return  numerator;
    }

    public long getDenominator(){
        return  denominator;
    }

    public Rational add(Rational secondRational){
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);
    }

    public Rational substract(Rational secondRational){
        long n = numerator * secondRational.getDenominator() - denominator* secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);
    }

    public Rational multiply(Rational secondRational){
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);
    }

    public Rational divide(Rational secondRational){
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational(n,d);
    }

    @Override
    //toStringO 方法以numerator/denominator(分子/分母)的形式返回一个Rational 对象的 字符串表示，
    // 如果分母为 1 就将它简化为 numerator
    public String toString(){
        if(denominator == 1){
            return numerator + "";
        }else{
            return numerator+"/"+denominator;
        }
    }

    @Override
    //如果该有理数和另一个有理数相等， 那么方法 equalsCObject other) 返回值为真。
    public boolean equals(Object other){
        if((this.substract((Rational) (other))).getNumerator() == 0){
            return true;
        }else{
            return false;
        }

    }
    //Number 类中的抽象方法 intValue 、longValue 、floatValue 和 doubleValue 在 Rational 类中被实现

    @Override
    public int intValue(){
        return (int) doubleValue();

    }

    @Override
    public float floatValue(){
        return (float) doubleValue();
    }

    @Override
    public double doubleValue(){
        return numerator* 1.0/denominator;
    }
    @Override
    public long longValue(){
        return (long)doubleValue();
    }

    @Override
    //Comparable 接 口 中 的 comp「a eTo(Object other) 方 法 在 Rational 类 中 被 实 现,用于将该有理数与另一个有理数进行比较。
    public int compareTo(Rational o){
        if(this.substract(o).getNumerator() > 0){
            return 1;

        }else if(this.substract(o).getNumerator() <0){
            return -1;
        }else{
            return 0;
        }
    }

}
