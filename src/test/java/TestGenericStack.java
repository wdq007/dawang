import com.dawang.introjava.comprehensive.GenericStack;

public class TestGenericStack {
    public static void main(String[] args){
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Beijing");
        stack1.push("Shanghai");
        stack1.push("Hangzhou");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        //没有指定具体类型的泛型类和泛型接口被称为原始类型(Raw type)，用于和早起的java版本向后兼容。
        GenericStack stack = new GenericStack();
        GenericStack<Object> stackAgain = new GenericStack<Object>();

        GenericStack stack3;
        stack3 = new GenericStack<String>();
        stack3.push("Welcome to Java");
        stack3.push(new Integer(2));
        System.out.println(stack3);


    }




}
