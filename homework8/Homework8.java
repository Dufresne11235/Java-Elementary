package jelesson8.homework8;

public class Homework8 {
    public static void main(String[] args) {
        CollectionClass col1 = new CollectionClass();
        CollectionClass col2 = new CollectionClass();

        //add
        col1.add("Cupcake");
        col1.add("Donut");
        col2.add("Cupcake");
        col2.add("Donut");
        //equals
        System.out.println(col1.equals(col2));
        col1.add("Eclair");
        System.out.println(col1.equals(col2));
        //indexadd
        col1.add(0, "Gingerbread");
        col1.add(0, "Honeycomb");
        col1.print();
        //delete
        col1.delete("Honeycomb");
        col1.delete(2);
        //getindex
        System.out.println("0 element: " + col1.getIndex(0));
        //contain
        System.out.println("Contains Gingerbread: " + col1.contain("Gingerbread"));
        //size+clear
        System.out.println("Size before deletion " + col1.size());
        col1.print();
        col1.clear();
        System.out.println("Size after deletion " + col1.size());
        col1.print();
    }
}

