package src.main.java.com.wilyr.javacore.chapter18.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Set<Integer> set = new HashSet<Integer>();
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            result = !set.add(array[i]);
            if (result) {
                break;
            }
        }
    }
}
