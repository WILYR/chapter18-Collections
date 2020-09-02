package src.main.java.com.wilyr.javacore.chapter18.tasks;

public class task2 {
    public static void main(String[] args) {
        Integer array[] = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        int count = 1;
        boolean tf = false;
        int used = 0;
        for (int i = 0; i < array.length; i++) {
            count = 1;
            if (array[i] != used) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        used = array[j];
                        tf = true;
                        count++;
                    }
                }
                if (count == 1) {
                    continue;
                } else {
                    System.out.println("\nЧисло " + used + " повторяется " + count + " раза");
                }
            }
        }
        if (!tf) {
            System.out.println("\nПовторений нет");
        }
    }
}
