package jelesson7.homework7;

public class Homework7 {
    public static void main(String[] args) {
        String input = "Fili, Kili, Oin, Gloin, Dwalin, Balin, Bifur, Bofur, Bombur, Dori, Nori, Ori, Thorin";
        String[] someDwarves = input.split(", ");
        Collection col1 = new Collection(0);
        for (String el : someDwarves) {
            col1.add(el);
        }
        col1.print();

        //get
        System.out.println(col1.get(6));
        System.out.println(col1.get(7));
        System.out.println(col1.get(8));

        //addindex
        col1.add(0,"Gandalf");
        col1.add(1,"Bilbo");
        col1.print();

        //delete
        col1.delete(3);
        col1.delete(2);
        col1.delete("Thorin");
        col1.print();
    }
}
