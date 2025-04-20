package Stack;

import java.util.EmptyStackException;

public class StackUsingArrayList {
    Object[] arr = new Object[10];
    int index = 0;

    // push()
    public void push(Object e) {
        if (index >= arr.length) {
            increase();
        }
        arr[index++] = e;
    }

    // increase()
    private void increase() {
        Object[] temp = new Object[(arr.length*3)/2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    //pop()
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object ele = arr[index-1];
        arr[--index] = null;
        return ele;
    }

    // peek()
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[index-1];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}