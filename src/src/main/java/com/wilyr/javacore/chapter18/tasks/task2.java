package src.main.java.com.wilyr.javacore.chapter18.tasks;

public class task2 {
    public static void main(String[] args) {
        Integer array[] = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        int count = 1;
        int used = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    used = array[j];
                    count++;
                }
            }
        }
        System.out.println("\n" + count);
        //System.out.println("Число " + array[i] + " повторяется " + count + "раз");
    }
}
