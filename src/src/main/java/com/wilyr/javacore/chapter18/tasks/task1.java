package src.main.java.com.wilyr.javacore.chapter18.tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> adq = new HashSet<Integer>();
        System.out.print("Set size: ");
        int inputsize = in.nextInt();
        while (adq.size() != inputsize) {
            adq.add((int) (Math.random() * 20));
        }
        for (int i : adq) {
            System.out.print(i + " ");
        }
        System.out.print("\nSet number: ");
        int number = in.nextInt();
        Integer array[] = new Integer[adq.size()];
        array = adq.toArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println("Result: " + i + " " + j);
                    return;
                }
            }
        }
    }
}
