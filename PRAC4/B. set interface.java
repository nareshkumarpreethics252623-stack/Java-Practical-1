package prac4;

import java.util.*;

public class PRAC4 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); 
        set.add("Orange");

        System.out.println("Set Elements:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
