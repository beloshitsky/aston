public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private T[] elements;

    private int size;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int capacity) {
        this.elements = (T[]) new Object[capacity];
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
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

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

    public static <T extends Comparable<T>> void sort(MyArrayList<T> list) {
        MyArrayList<T> left = new MyArrayList<>();
        MyArrayList<T> right = new MyArrayList<>();

        if (list.size() == 1) return;

        int middle = list.size() / 2;

        for (int i = 0; i < middle; i++) {
            left.add(list.get(i));
        }

        for (int i = middle; i < list.size(); i++) {
            right.add(list.get(i));
        }

        sort(left);
        sort(right);

        merge(left, right, list);
    }

    /**
     * метод сравнивает элементы из двух подсписков и добавляет их в оригинальный список в отсортированном порядке
     * @param left - левая часть списка
     * @param right - правая часть списка
     * @param list - список для сортировки
     */
    private static <T extends Comparable<T>> void merge(MyArrayList<T> left, MyArrayList<T> right, MyArrayList<T> list) {

        int leftIndex = 0, rightIndex = 0, index = 0;

        while ((leftIndex < left.size()) && (rightIndex < right.size())) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0) {
                list.set(index, left.get(leftIndex));
                leftIndex++;
            } else {
                list.set(index, right.get(rightIndex));
                rightIndex++;
            }
            index++;
        }

        while (leftIndex < left.size()) {
            list.set(index, left.get(leftIndex));
            index++;
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            list.set(index, right.get(rightIndex));
            index++;
            rightIndex++;
        }
    }
}
