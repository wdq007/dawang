/**
 * Page 78
 * 程序清单22-1
 * 算法设计是为解决某个问题开发一个数学流程
 * 算法分析是预测一个算法的性能
 * 使用大O符号来衡量算法效率 Big O notation：
 * 大O符号标记可以基于输入的大小得到一种衡量算法的时间复杂度函数。可以忽略函数中的倍乘常量和非主导项
 * 通过检查两个算法的增长率来比较他们
 *
 * 使用大O符号（big O notation）表示数量级
 * 线性查找算法的复杂度就是n阶乘，O(n),所以将复杂度为O(n)的算法为线性算法
 *
 * 导致最短执行时间的输入称为最佳情况输入， 导致最长执行时间的输入称为最差情况输入。
 * 平均情况分析是比较理想的，但是很难完成
 * 由于最差情况分析比较容易完成，所以分析通常针对最差情况进行
 *
 * 大O标记估算一个算法与输入规模相关的执行时间。
 * 如果执行时间与输入规模无关，就称该算法耗费了常量时间，用O(1)表示
 *
 * 空间复杂度是使用算法测量内存空间的大小
 *
 * 时间复杂度为O(n2)的算法称为平方级算法，通常两层嵌套的算法都是平方级的。
 *
 * O(logn)=O(log2n)=O(logan)
 *
 *
 * 二分查找算法的复杂度为O(logn),称为对数算法。 log的底为2，但是底不会影响对数增长率，因此可以将其忽略
 * 选择排序算法的复杂度为O(n2)
 *
 * 汉诺塔算法的复杂度为O(2n)，称为指数算法，体现为指数级的增长率
 *
 * 总结
 * O(1)    常量时间
 * O(logn) 对数时间
 * O(n)    线性时间
 * O(nlogn) 对数-线性时间
 * O(n2)  二次时间
 * O(n3), 三次时间
 * O(2n)，指数时间
 *
 */
public class TestPerformance {

    public static void main(String[] args){
        getTime(1000000);
        getTime(10000000);
        getTime(100000000);
        getTime(1000000000);


    }

    public static void getTime(long n){
        long startTime = System.currentTimeMillis();
        long k = 0;
        for(int i =1;i<=n;i++){
            k = k+5;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n +" is "
        +(endTime - startTime) + " milliseconds");
    }
}
