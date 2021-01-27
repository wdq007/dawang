import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Page58
 * 程序清单21-4 树形集，实现了SortedSet接口。SortedSet是Set的一个子接口，确保集合中的元素是有序的。
 * 集合框架中的所有具体类至少有两个构造方法， 一个是创建空集合的无参构造方法，另一个是用某个合集来创建实例的构造方法
 *
 * 当更新一个集合时，如果不需要保持集合的p排序关系，就应当使用散列集，因为散列集中插入和删除元素所花时间少
 * 当需要一个排序好的集合时，可以从这个散列集创建一个树形集
 */

public class TestTreeSet {
    public static void main(String[] args){
        Set<String> chineseCities = new HashSet<>();
        chineseCities.add("Beijing");
        chineseCities.add("Shanghai");
        chineseCities.add("Shenzhen");
        chineseCities.add("Guangzhou");
        chineseCities.add("Hangzhou");
        chineseCities.add("Beijing");
        //从一个HashSet创建TreeSet对象时， 集合中的元素被排序
        TreeSet<String> orderedChineseCities = new TreeSet<>(chineseCities);
        System.out.println("Sorted tree set: " + orderedChineseCities);
        System.out.println("First(): " + orderedChineseCities.first());
        System.out.println("Last(): " + orderedChineseCities.last());
        //返回Hangzhouz之前的那些元素
        System.out.println("headset(\"Hangzhou\"): " + orderedChineseCities.headSet("Hangzhou"));
        //返回Hangzhou以及之后的那些元素
        System.out.println("tailset(\"Hangzhou\"): " + orderedChineseCities.tailSet("Hangzhou"));


        System.out.println("lower(\"P\"): " + orderedChineseCities.lower("P")); //返回小于P的最大元素
        System.out.println("higher(\"P\"): "+ orderedChineseCities.higher("P"));//返回大于P的最小元素
        System.out.println("floor(\"P\"): " + orderedChineseCities.floor("P")); //返回小于或等于P的最大元素
        System.out.println("ceiling(\"P\"): " + orderedChineseCities.ceiling("P")); //返回大于或等于P的最小元素
        System.out.println("pollFirst(): " + orderedChineseCities.pollFirst()); //删除第一个元素并返回删除的元素
        System.out.println("pollLast(): " + orderedChineseCities.pollLast() );//删除最后一个元素并返回删除的元素
        System.out.println("New tree set: " + orderedChineseCities);



    }

}
