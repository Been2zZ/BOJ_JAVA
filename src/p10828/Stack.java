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
