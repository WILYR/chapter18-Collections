package src.main.java.com.wilyr.javacore.chapter18.collections.example;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        Address a1 = new Address("J.W.West", "11 Oaklive", "Urbana", "IL", "61801");
        Address a2 = new Address("Ralph Baker", "1142 Marple Lane", "Mahomet", "IL", "61853");
        Address a3 = new Address("Tom Carlton", "867 Elm St", "Champaingh", "IL", "61820");
        LinkedList<Address> address = new LinkedList<>();
        address.add(a1);
        address.add(a2);
        address.add(a3);
        for (Address a : address) {
            System.out.println(a + "\n");
        }
        System.out.println();
    }
}
