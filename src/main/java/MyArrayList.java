public class MyArrayList<T> {
    private static final int DEFAULT_SIZE = 10;

    private T[] elements;

    private int size;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(T element) {
        if (size == elements.length) resize();
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return elements[index];
    }

    public int indexOf(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) return i;
            }
        }

        return -1;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        elements[index] = element;
    }

    public void remove(int index) {
        for (int i = index; i < (size - 1); i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void resize() {
        T[] oldElements = elements;

        elements = (T[]) new Object[oldElements.length + oldElements.length / 2];

        for (int i = 0; i < size; i++) {
            elements[i] = oldElements[i];
        }
    }
}
