import java.util.*;

/**
 * 程序清单21-6 在测试一个元素是否在集合或者线性表中时，集合比线性表更加高效。
 */
public class TestListSetPerformance {
    static final int N = 50000;
    public static void main(String[] args){
        //创建了一个包含数字0到50000-1的线性表
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(i);
        }
        Collections.shuffle(list); //打乱线性表

        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Member test time for hash set is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove element time for hash set is " + getRemoveTime(set1) + " milliseconds");

        Collection<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("member test time for linked hash set is " + getTestTime(set2) + " milliseconds");
        System.out.println("remove element time for linked hash set is " + getRemoveTime(set2) + " milliseconds");

        Collection<Integer> set3 = new TreeSet<>(list);
        System.out.println("member test time for tree set is " +  getTestTime(set3) + " milliseonds");
        System.out.println("remove element time for tree set is " + getRemoveTime(set3) + " milliseconds");

        Collection<Integer> list1 = new ArrayList<>(list);
        System.out.println("member test time for array list is " + getTestTime(list1) + " milliseconds");
        System.out.println("remove element time for array list is " + getRemoveTime(list1) + " milliseconds");

        Collection<Integer> list2 = new LinkedList<>(list);
        System.out.println("member test time for linked list is " + getTestTime(list2) + " milliseconds");
        System.out.println("remove element time for linked list is " + getRemoveTime(list2) + " milliseconds");

    }

    public static long getTestTime(Collection<Integer> c){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<N; i++){
            c.contains((int) (Math.random() * 2 * N)); //测试数字是否在集合中

        }
        return  System.currentTimeMillis() - startTime;
    }
    public static long getRemoveTime(Collection<Integer> c){
        long startTime = System.currentTimeMillis();
        for(int i = 0;i< N;i++){
            c.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
