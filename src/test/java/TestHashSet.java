import java.util.HashSet;
import java.util.Set;

/**
 * Page 55
 * 程序清单21-1 散列集类 HashSet 一个实现了Set的具体类
 * 默认情况下，初始容量为16，负载系数为0.75， 负载系数的值在0.0和1.0之间
 * 当元素超过容量和负载系数的乘积，容量就会自动翻倍， 容量为16而负载系数为0.75时， 尺寸达到12容量将翻倍到32
 * 添加到散列集的对象必须以一种正确分散散列码的方式实现hasCode方法
 * Java API中大多数类都实现了hashCode方法
 * Integer 类的hashCode方法返回它的int值
 * Character类的hasCode方法返回它的unicode
 * String类的hasCode方法返回的, 比如"Aa"  65*31+97*1=2112
 */
public class TestHashSet {

    public static void main(String[] args){
        Set<String> chineseCities = new HashSet<>();
        chineseCities.add("Beijing");
        chineseCities.add("Shanghai");
        chineseCities.add("Guanzhou");
        chineseCities.add("ShenZhen");
        chineseCities.add("Hangzhou");
        chineseCities.add("Beijing"); //添加多次，但是只有存储一次
        System.out.println(chineseCities);
        //集合接口继承Iterable接口， 因此集合中的元素是可遍历的
        for(String city:chineseCities){
            System.out.print(city.toUpperCase()+" "); //没有按照插入时的顺序，因为散列集中的元素没有特定顺序。
                                                      //如果需要强加顺序需要用到LinkedHashSet
        }

        System.out.println(new Character('a').hashCode());
        System.out.println(new String("Aa").hashCode());

    }
}
