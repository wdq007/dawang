import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Page69
 * 程序清单21-8
 * 实现Map接口的所有具体类至少有两种构造方法
 * 一种是无参构造方法
 * 另一种是从Map的一个实例来创建映射表
 * 如果更新映射表不需要保持映射表的顺序就是用HashMap， 如果需要保持插入顺序或是访问顺序就是用LinkedHashMap
 * 如果需要使映射表按照键排序就使用TreeMap
 *
 *
 * java.util.Map<K,V> <--java.util.AbstractMap<K,V><-java.util.HashMap<K,V>
 *                                                 <-java.util.LinkedHashMap<K,V>
 *                                                 <-java.util.TreeMap<K,V>
 * java.util.Map<K,V> <--java.util.SortedMap<K,V><--java.util.NavigatableMap<K,V><--java.util.TreeMap<K,V>
 */
public class TestMap {
    public static void main(String[] args){
        //HashMap的条目顺序是随机的
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+"\n");
        //TreeMap的条目按键的升序排列
        Map<String, Integer> treeMap = new TreeMap<>(hashMap); //从一个散列映射表创建树形映射表
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap + "\n");
        //LinkedHashMap按元素最后一次被访问的时间从早到晚排序， 也可以按插入顺序
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);

        System.out.println("\nThe age for "+ "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap+"\n");

    }
}
