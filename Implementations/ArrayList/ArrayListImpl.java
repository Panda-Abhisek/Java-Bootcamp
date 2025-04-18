public class ArrayListImpl {
    Object[] arr = new Object[10];
    int index = 0;

    public void add(Object e) {
        if (index >= size()) {
            increase();
        }
        arr[index++] = e;
    }

    public void add(int pos, Object e) {
        if (pos <= -1 || pos >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index >= arr.length) {
            increase();
        }
        for (int i = size()-1; i >= pos; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = e;
        index++;
    }

    public void remove(int pos) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = pos+1; i < size(); i++) {
            arr[pos] = arr[pos+1];
        }
        index--;
        arr[index] = null;
    }

    private void increase() {
        Object[] temp = new Object[(arr.length*3)/2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public Object get(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int size() {
        return index;
    }
}
