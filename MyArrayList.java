import java.util.Arrays;

public class MyArrayList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = value;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        if (size == array.length) {
            ensureCapacity();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


  /*  Этот код добавляет методы size(), add(index, value) и remove(int index) к
        вашей MyArrayList, позволяя
        получать размер списка, добавлять элементы по индексу и удалять
        элементы по индексу.
   */