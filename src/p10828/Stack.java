/**
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * */
package p10828;

public class Stack {
    Object stack[];

    int size = 0;

    public void init(int stackSize) {
        stack = new Object[stackSize];
    }

    public void push(int x) {
        stack[size] = x;
        size++;
    }

    public Object pop() {
        Object top;
        if(size != 0) {
            top = stack[size];
            stack[size] = null;
            size--;
            return top;
        }
        else
            return -1;
    }

    public int empty() {
        if(size == 0)
            return 1;
        else
            return 0;
    }

    public int size() {
        return size;
    }

    public Object top() {
        if(size != 0)
            return stack[size];
        else
            return -1;
    }
}
