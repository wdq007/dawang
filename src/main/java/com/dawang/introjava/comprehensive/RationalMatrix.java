package com.dawang.introjava.comprehensive;

/**
 * 程序清单19-12
 */

public class RationalMatrix  extends GenericMatix<Rational>{
    @Override
    protected Rational add(Rational o1, Rational o2) {
        return o1.add(o2);
    }

    @Override
    protected Rational multiply(Rational o1, Rational o2){
        return o1.multiply(o2);
    }

    @Override
    protected  Rational zero(){
        return new Rational(0,1);
    }
}
