/**
 * 14
 * push 1
 * push 2
 * top
 * size
 * empty
 * pop
 * pop
 * pop
 * size
 * empty
 * pop
 * push 3
 * empty
 * top
 * */
package p10828;

public class p10828 {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.init(14);

        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println(stack.top());
    }
}
