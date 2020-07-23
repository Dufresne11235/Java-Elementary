package jelesson8.homework8;

interface Collection {
    boolean add(Object o);

    boolean add(int index, Object o);

    boolean delete(Object o);

    Object getIndex(int index);

    boolean contain(Object o);

    boolean equals(Collection str);

    boolean clear();

    int size();
}
