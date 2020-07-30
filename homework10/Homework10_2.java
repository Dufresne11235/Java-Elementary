package jelesson10.homework10;

public class Homework10_2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Iterator iterator = new Iterator(array);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

class Iterator implements java.util.Iterator {
    private final Object[] array;
    private Object current;
    private int index = 0;

    public Iterator(Object[] objects) {
        array = objects;
    }

    public boolean hasNext() {
        return index != array.length;
    }

    public Object next() {
        current = array[index++];
        return current;
    }
}