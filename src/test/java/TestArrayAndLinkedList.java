import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Page 29
 * 程序清单20-3
 * 线性表可以存储相同的元素
 * ArrayList 和 LinkedList 不同体现在内部实现上
 * ArrayList获取元素的效率比较高
 * 在线性表的起始位置插入和删除元素，LinkedList的效率比较高
 *  ArrayList 和 LinkedList 在中间或者末尾上插入和删除元素方面具有同样的性能
 *
 * LinkedList可以使用get(i)方法，但是是比较耗时的操作，不要使用它来遍历线性表中的所有元素。
 * 应该使用迭代器， foreach循环隐式地使用了迭代器。
 *
 */
public class TestArrayAndLinkedList {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(3,30);

        System.out.println("A list of Integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1,"Red");
        linkedList.removeLast();
        linkedList.addFirst("Green");
        System.out.println("Display the linked list forward");
        ListIterator<Object> listIterator =  linkedList.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();

        System.out.println("Display the linked list backward");
        listIterator = linkedList.listIterator(linkedList.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
        //System.out.println();

    }


}
