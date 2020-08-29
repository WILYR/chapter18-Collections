package src.main.java.com.wilyr.javacore.chapter18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> hm = new HashMap<String, Double>();
        hm.put("Oleg", new Double(1241.2));
        hm.put("Grisha", new Double(-42.22));
        hm.put("Sasha", new Double(1522.7));
        hm.put("Max", new Double(1253223.993));
        hm.put("Nik", new Double(-2091.5));
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        foreach(set);
        hm.put("Oleg", hm.get("Oleg") + 22);
        foreach(set);

    }

    public static void foreach(Set<Map.Entry<String, Double>> set) {
        for (Map.Entry<String, Double> i : set) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
        System.out.println();
    }
}
