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
        int number = 9;
        Iterator<Integer> itr = adq.iterator();
        Iterator<Integer> itr2 = adq.iterator();
        Integer element, element2, tmp = null, tmp2 = null, count = 0;
        exitLabel: while (itr.hasNext()) {
            element = itr.next();
            while (itr2.hasNext()) {
                element2 = itr2.next();
                if (!element.equals(element2) && element + element2 == number) {
                    tmp = element;
                    tmp2 = element2;
                    break exitLabel;
                }
            }
            itr2 = adq.iterator();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(adq);
        arrayList.indexOf(tmp);
        arrayList.indexOf(tmp2);
    }
}
