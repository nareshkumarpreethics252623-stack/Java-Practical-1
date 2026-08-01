package prac4;

import java.util.*;

public class PRAC4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("cricket");
        list.add("football");
        list.add("badminton"); 
        list.add("football");

        System.out.println("sport list :");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

