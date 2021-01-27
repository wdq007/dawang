package com.dawang.introjava.comprehensive;

import java.util.Comparator;

/**
 * 程序清单20-4 Page 31
 * Comparable 用于实现Comparable的类的对象的比较， Comparator用于没有实现Comparable的类的对象的比较
 * 使用Comparable接口来比较对象被称为使用自然顺序进行比较， 使用Comparator接口来比较元素被称为使用比较器来进行比较。
 */

public class GeometricObjectComparator
        implements Comparator<GeometricObject>, java.io.Serializable {
    /*通常对于比较器来说， 实现Serializable是个好主意， 因为它们可以用于可序列化数据结构的排序方法
      为了是数据结构能够成功序列化， 比较器必须实现Serializable接口*/
    public int compare(GeometricObject o1, GeometricObject o2){
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        if(area1 < area2){
            return -1;
        }else if(area1 == area2){
            return 0;
        }else{
            return 1;
        }

    }
}
