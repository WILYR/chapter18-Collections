package src.main.java.com.wilyr.javacore.chapter18.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element);
        }
        System.out.println();

        ListIterator<String> lit = al.listIterator(al.size());
        while (lit.hasPrevious()) {
            String element = lit.previous();
            System.out.print(element);
        }
        System.out.println();

        ListIterator<String> lit2 = al.listIterator();
        while (lit2.hasNext()) {
            String element = lit2.next();
            lit2.set(element + "+");
        }
        System.out.print(al);


    }
}
