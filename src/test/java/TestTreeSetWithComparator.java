import com.dawang.introjava.comprehensive.Circle;
import com.dawang.introjava.comprehensive.GeometricObject;
import com.dawang.introjava.comprehensive.GeometricObjectComparator;
import com.dawang.introjava.comprehensive.Rectangle;

import java.util.Set;
import java.util.TreeSet;

/**
 * Page 60
 * 程序清单21-5
 * 如果使用无参构造方法创建， 则会假定元素的类实现了Comparable接口， 并使用compareTo方法来比较集合中的元素
 * 要使用comparator，则必须使用构造方法TreeSet（Comparator comparator），使用比较器中的compare方法来创建一个排好序的集合
 */
public class TestTreeSetWithComparator {

    public static void main(String[] args){

        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Rectangle(4,5));
        set.add(new Circle(40));//不允许有重复元素
        set.add(new Circle(40));
        set.add(new Rectangle(4,1));
        System.out.println("A sorted set of Geometric objects: ");
        for(GeometricObject element:set){
            System.out.println("Area = " + element.getArea());
        }
    }
}
