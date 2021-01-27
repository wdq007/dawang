import com.dawang.introjava.comprehensive.Rational;

/**
 * Page 448
 * 程序清单13-12 Rational类的测试程序
 */
public class TestRationalClass {

    public static void main(String[] args){
        Rational r1 = new Rational(4,2);
        Rational r2 = new Rational(2,3);
        //注 意， 当 使 用 加 号(+) 将 一 个 字 符 串 和 一 个 对 象 进 行 链 接 时，
        // 使 用 的 是 来 自 toStringO 方法的这个对象的字符串表示同这个字符串进行链接。
        System.out.println(r1+"+"+r2+"="+r1.add(r2)); //等价于 rl•toString()+"+"+r2•toString()+"="+rl•add(r2)•toString()。
        System.out.println(r1+"-"+r2+"="+r1.substract(r2));
        System.out.println(r1+"*"+r2+"="+r1.multiply(r2));
        System.out.println(r1+"/"+r2+"="+r1.divide(r2));
        System.out.println(r2+"="+r2.doubleValue());
    }
}
