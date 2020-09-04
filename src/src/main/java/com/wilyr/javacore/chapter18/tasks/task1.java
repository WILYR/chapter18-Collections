package src.main.java.com.wilyr.javacore.chapter18.tasks;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(checkSum(array, 7)));
    }

    public static int[] checkSum(Integer[] array, int number) {
        int[] result = new int[0];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            map.put(i, array[i]);
            if (map.containsValue(number - array[i])) {
                Set<Map.Entry<Integer, Integer>> set = map.entrySet();
                for (Map.Entry<Integer, Integer> keyValue : set) {
                    if (keyValue.getValue() == number - array[i]) {
                        a = keyValue.getKey();
                    }
                }
                result = new int[]{i, a};
            }
        }
        return result;
    }
}
