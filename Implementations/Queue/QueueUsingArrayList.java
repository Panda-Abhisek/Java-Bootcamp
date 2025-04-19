package Queue;

public class QueueUsingArrayList {
    Object[] arr = new Object[10];
    int index = 0;

    public void increase() {
        Object[] temp = new Object[(arr.length*3)/2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void add(Object e) {
        if (index >= arr.length) {
            increase();
        }
        arr[index++] = e;
    }

    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object ele = arr[0];
        for (int i = 1; i < size(); i++) {
            arr[i-1] = arr[i];
        }
        arr[--index] = null;
        return ele;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[0];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
