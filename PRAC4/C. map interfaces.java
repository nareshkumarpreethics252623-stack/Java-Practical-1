package prac4;

import java.util.*;

public class PRAC4 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Preetha");
        map.put(102, "jenny");
        map.put(103, "Bobby");

        System.out.println("Map Elements:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
