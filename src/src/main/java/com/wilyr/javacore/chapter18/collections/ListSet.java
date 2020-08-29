package src.main.java.com.wilyr.javacore.chapter18.collections;

import java.util.*;

public class ListSet {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        for (String list : list1) {
            System.out.println(list);
        }
        //System.out.println(list1.indexOf("C"));
        //System.out.println(list1.get(1));
        HashSet<String> list2 = new HashSet<String>();
        list2.add("A");
        //list2.add("A");
        list2.add("B");
        list2.add("C");
        for (String list : list2) {
            System.out.println(list);
        }
        ArrayList<String> aa = new ArrayList<>();
        System.out.println("Рамер массива: " + aa.size());
        aa.ensureCapacity(10);
        aa.add("A");
        aa.add("B");
        aa.add("C");
        aa.add("D");
        aa.add(1, "B2");
        System.out.println("Рамер массива: " + aa.size());
        System.out.println("Массив: " + aa);
        aa.remove(0);
        System.out.println("Рамер массива: " + aa.size());
        System.out.println("Массив: " + aa);
        aa.remove("D");
        System.out.println("Рамер массива: " + aa.size());
        System.out.println("Массив: " + aa);
        aa.trimToSize();

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        Integer ai[] = new Integer[num.size()];
        ai = num.toArray(ai);
        int sum = 0;
        for (int a : ai) {
            sum += a;
        }
        System.out.println("Сумма: " + sum);

        LinkedList<String> jj = new LinkedList<>();
        jj.add("A");
        jj.addFirst("A2");
        jj.add("B");
        jj.add("C");
        jj.add("D");
        System.out.println("Начальный список: " + jj);
        jj.remove(0);
        System.out.println("Cписок после уаления: " + jj);
        String save = jj.get(1);
        jj.set(2, save);
        System.out.println("Список после амены: " + jj);

        HashSet<String> hs = new HashSet<>();
        hs.add("Альфа");
        hs.add("Бета");
        hs.add("Гамма");
        hs.add("Омега");
        hs.add("Терра");
        System.out.println(hs);
        if (hs.contains("Бета")) {
            System.out.println("True");
        }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Альфа");
        lhs.add("Бета");
        lhs.add("Гамма");
        lhs.add("Омега");
        lhs.add("Терра");
        System.out.println(lhs);
        if (lhs.contains("Бета")) {
            System.out.println("True");
        }

        TreeSet<String> ts = new TreeSet<>();
        ts.add("B");
        ts.add("C");
        ts.add("A");
        System.out.println(ts);
    }
}
