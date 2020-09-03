package src.main.java.com.wilyr.javacore.chapter18.tasks;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> adq = new TreeSet<>();
        adq.add(1);
        adq.add(2);
        adq.add(5);
        adq.add(7);
        adq.add(8);
        int number = 13;
        Iterator<Integer> itr = adq.iterator();
        Integer tmp = null, tmp2 = null;
        while (itr.hasNext()) {
            Integer element = itr.next();
            if (adq.contains(number - element)) {
                tmp = element;
                tmp2 = number - element;
                break;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(adq);
        System.out.println(arrayList.indexOf(tmp));
        System.out.println(arrayList.indexOf(tmp2));
    }
}
