package src.main.java.com.wilyr.javacore.chapter18.tasks;

import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 4, 4, 5};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        isTrue(array.length, set.size());
    }

    private static boolean isTrue(int size, int size2) {
        if (size == size2) {
            return false;
        }
        return true;
    }
}
