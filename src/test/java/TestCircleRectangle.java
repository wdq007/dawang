import com.dawang.introjava.comprehensive.Circle;
import com.dawang.introjava.comprehensive.Rectangle;

/**
 * Page 352
 * 程序清单 11-4
 *
 * 1. 子类并不是父类的一个子集
 * 2.1 父类中的私有数据域在该类之外是不可访问的,因此，不能在子类中直接使用。
 * 2.2 但是，如果父类中定义了公共的访问器 / 修改器，那么可以通过这些公共的访问器 / 修 改器来访问和修改它们。
 * 3.1 不是所有的 “是一种”(is a)关系都该用继承来建模。正方形是一种矩形，但是不应该定义一个 Square 类来扩展 Rectangle 类，
 * 3.2 因为 width 和 height 属性并不适 合于正方形。应该定义一个继承自 CeometricObject 类的 Square 类，并为正方形的 边定义一个 side 属性。
 * 4.1 继承是用来为 “是一种” 关系(is a) 建模的。不要仅仅为了重用方法这个原因而盲目地扩展一个类。
 * 4.2 例如:尽管 Person 类和 Tree 类可以共享类似高度和重量这样的通用特性，但是从 Person 类扩展出 Tree 类是毫无意义的。
 * 4.3 一个父类和它的子类之间必须存在 “是一种”(isa)关系。
 * 5.1 某些程序设计语言是允许从几个类派生出一个子类的。这种能力称为多重继承 ( multiple inheritance)。
 * 5.2 但是在 Java 中是不允许多重继承的。一个 Java 类只可能直接 继承自一个父类。这种限制称为单一继承(single inheritance)。
 * 5.3 如果使用 extends 关 键字来定义一个子类，它只允许有一个父类。然而，多重继承是可以通过接口来实 现的。
 */
public class TestCircleRectangle {
    public static void main(String[] args){

        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());


        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea() );
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
