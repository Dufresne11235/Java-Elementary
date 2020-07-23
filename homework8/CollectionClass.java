package jelesson8.homework8;

public class CollectionClass implements Collection {
    private String[] list;
    private int counter = 0;

    public CollectionClass() {
        this.list = new String[10];
    }

    private String[] create(String[] list) {
        String[] returnList = new String[list.length * 3 / 2 + 1];
        for (int i = 0; i < list.length; i++) {
            returnList[i] = list[i];
        }
        return returnList;
    }

    @Override
    public boolean add(Object o) {
        if (counter == list.length) {
            this.list = create(list);
        }
        list[counter++] = (String) o;
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        if (index > counter || index < 0) {
            throw new IndexOutOfBoundsException("list size different");
        } else if (index == counter) {
            list[counter++] = (String) o;
            return true;
        }

        for (int i = counter; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = (String) o;
        counter++;
        return true;
    }

    @Override
    public boolean delete(Object o) {
        if (o == null) {
            return false;
        }
        for (int i = 0; i < counter; i++) {
            if (list[i].equals(o)) {
                delete(i);
            }
        }
        return true;
    }

    @Override
    public Object getIndex(int index) {
        if (index >= list.length || index < 0) {
            throw new IndexOutOfBoundsException("out of bounds");
        } else {
            return list[index];
        }
    }

    @Override
    public boolean contain(Object o) {
        if (counter == 0) {
            return false;
        }
        for (int i = 0; i < counter; i++) {
            if (list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (this == str) {
            return true;
        } else if (this.size() != str.size()) {
            return false;
        }

        for (int i = 0, counter = 0; i < this.size(); i++) {
            if (this.list[i].equals(str.getIndex(i))) {
                counter++;
            }
        }
        return counter == this.size();
    }

    @Override
    public boolean clear() {
        if (counter != 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = null;
            }
            counter = 0;
        }
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    public boolean delete(int index) {
        if (index >= list.length || index < 0) {
            return false;
        } else {
            for (int i = index; i <= counter - 1; i++) {
                list[i] = list[i + 1];
            }
            counter--;
            return true;
        }
    }

    public void print() {
        for (int i = 0; i <= counter; i++) {
            if (list[i] == null) {
                break;
            }
            System.out.println((i + 1) + " " + list[i]);
        }
    }
}
