package jelesson10.homework10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Homework10_1 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("1");
        array1.add("2");
        array1.add("3");
        array1.add("4");
        array1.add("5");
        array1.add("4");
        array1.add("3");
        array1.add("2");
        array1.add("1");
        System.out.println(array1);
        System.out.println(toHashSetList(array1));
    }

    static Collection toHashSetList(Collection arrayList) {
        HashSet<String> hashSet1 = new HashSet<String>(arrayList);
        return hashSet1;
    }
}
