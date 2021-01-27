import com.dawang.introjava.comprehensive.demo.TrafficLight;

/**
 * Page 654
 * 程序清单 I-4
 * 使用TrafficLight 的测试程序
 */
public class TestTrafficLight {

    public static void main(String[] args){
        //一个枚举值TrafficLight.RED賦值给变量light
        TrafficLight light = TrafficLight.RED;//访问TrafficLight.RED引起 JVM使用参数 “pleasestop” 调用构造方法。
        System.out.println(light.getDescription()); //枚举类型中的方法是和类中的方法调用一样 的。light .getDescriptionO 返回对枚举值的描述
    }
}
