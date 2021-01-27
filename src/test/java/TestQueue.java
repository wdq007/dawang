import java.util.LinkedList;

/**
 * Page 41
 * 程序清单20-7
 * LinkedList实现了Deque， Deque继承自queue， queue继承自java.util.Collection, LinkedList 很适合队列操作。
 * Deque支持在两端插入和删除元素。double-ended queue 双端队列的简称， 发音为"Deck"。
 */

public class TestQueue {
    public static void main(String[] args){
        java.util.Queue<String> province = new LinkedList<>();
        province.offer("Zhejiang");
        province.offer("Sichuan");
        province.offer("Hunan");
        province.offer("Fujian");

        while(province.size() > 0){
            System.out.print(province.remove()+" ");
        }
    }
}
