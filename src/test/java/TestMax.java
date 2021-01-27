import com.dawang.introjava.comprehensive.Max;
import com.dawang.introjava.comprehensive.MaxUsingGenericType;

public class TestMax {

    public static void main(String[] args){
        Max.max("Welcome",23);//运行是错误， 在编译是使用-Xlint:unchecked，编译器就会有警告。

        //MaxUsingGenericType.max("Welcome",23);//编译错误。
    }
}
