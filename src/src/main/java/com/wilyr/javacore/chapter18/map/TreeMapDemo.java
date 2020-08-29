package src.main.java.com.wilyr.javacore.chapter18.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Double> tm = new TreeMap<String, Double>();
        tm.put("Oleg", new Double(1241.2));
        tm.put("Grisha", new Double(-42.22));
        tm.put("Sasha", new Double(1522.7));
        tm.put("Max", new Double(1253223.993));
        tm.put("Nik", new Double(-2091.5));
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> i : set) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
        System.out.println();
        tm.put("Max", tm.get("Max") + 1000);
        for (Map.Entry<String, Double> i : set) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
        System.out.println();
    }
}
