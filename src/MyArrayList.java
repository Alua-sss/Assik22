
// This is my own ArrayList
public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    public void add(T element) {
        if (length == elements.length) {
            increaseCapacity();
        }
        elements[length++] = element;
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--length] = null;
    }

    public void clear() {
        elements = new Object[5];
        length = 0;
    }

    public int size() {
        return length;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }
}
