package src.main.java.com.wilyr.javacore.chapter18.collections;

import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        int sum = 0;
        for (int i : al) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSumma: " + sum);
    }
}
