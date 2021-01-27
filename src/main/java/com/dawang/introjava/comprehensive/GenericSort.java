package com.dawang.introjava.comprehensive;

/**
 * Page 7
 * 程序清单 19-4
 */
public class GenericSort {

    public static void main(String[] args){

        Integer[]  intArray = {2,4,3};
        Double[] doubleArray = {3.4,1.2,-22.1};
        Character[] charArray = {'a','J','r'};
        String[] stringArray = {"Bob","Cathy","Alice"};


        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);

    }

    //泛型方法， 对Comparable对象数组进行排序
    public static <E extends Comparable<E>> void sort(E[] list){ //指定E是Comparable的子类型，其次还指定进行比较的元素是E类型。
        E currentMin;
        int currentMinIndex;
        for(int i=0;i<list.length-1;i++){
            currentMin = list[i];
            currentMinIndex = i;

            for(int j = i+1;j<list.length;j++){
                if(currentMin.compareTo(list[j])>0){
                    currentMin = list[j];
                    currentMinIndex = j;

                }

            }

            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;

            }

        }

    }

    public static void printList(Object[]  list){
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i]+" ");

        }
        System.out.println();
    }


}
