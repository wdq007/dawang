package com.dawang.introjava.comprehensive;

import com.dawang.introjava.comprehensive.demo.GeometricObject;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**Page 6
 * 程序清单19-3
 * 需要程序清单13-4
 *
 */
public class BoundedTypeDemo {
    public static void main(String[] args){
        Rectangle rectangle= new Rectangle(2,2);
        Circle circle = new Circle(2);
        //System.out.println("Same Area ? "+equalArea(rectangle,circle));


    }
    //受限的泛型类型， 非受限泛型类型<E>等同于<E extends Object>
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
        return object1.getArea() == object2.getArea();

    }
}
