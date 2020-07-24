package jelesson7.homework7;

public class Collection {
    private String[] elem;
    private int length;
    private int lastIndex = 0;

    public Collection(int size) {
        this.length = size;
        this.elem = new String[size];
    }

    private String[] create(String[] list) {
        length = list.length * 3 / 2 + 1;
        String[] formedList = new String[length];
        for (int i = 0; i < list.length; i++) {
            formedList[i] = list[i];
        }
        return formedList;
    }

    public void add(String el) {
        if (lastIndex == length) {
            this.elem = create(elem);
            elem[lastIndex++] = el;
        } else {
            elem[lastIndex] = el;
            lastIndex++;
        }
    }

    public void add(int index, String el) {
        if (index > lastIndex || index < 0) {
            throw new IndexOutOfBoundsException("out of bounds");
        } else if (index == lastIndex) {
            elem[lastIndex++] = (String) el;
        }
        for (int i = lastIndex; i > index; i--) {
            elem[i] = elem[i - 1];
        }
        elem[index] = (String) el;
        lastIndex++;
    }

    public String get(int index) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException("out of bounds");
        } else {
            return elem[index] == null ? "no element at index " + index : index + " " + elem[index];
        }
    }

    public void delete(int index) {
        if (index >= length && index < 0) throw new IndexOutOfBoundsException("out of bounds");
        for (int i = index; i <= lastIndex - 1; i++) {
            elem[i] = elem[i + 1];
        }
        lastIndex--;
    }

    public void delete(String s) {
        if (s == null) throw new IllegalArgumentException("illegal argument");
        for (int i = 0; i < lastIndex; i++) {
            if (elem[i].equals(s)) delete(i);
        }
    }

    public void print() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(i + " " + elem[i] + " ");
        }
        System.out.println();
    }
}
