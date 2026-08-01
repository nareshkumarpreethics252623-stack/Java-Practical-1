package prac4;

import java.util.*;

public class PRAC4B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- List Interface -----");
        List<String> list = new ArrayList<>();

        System.out.print("Enter the number of elements for the List: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter List elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.println("List Elements: " + list);

        System.out.println("\n----- Set Interface -----");
        Set<String> set = new HashSet<>();

        System.out.print("Enter the number of elements for the Set: ");
        int m = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Set elements:");
        for (int i = 0; i < m; i++) {
            set.add(sc.nextLine());
        }

        System.out.println("Set Elements: " + set);

        System.out.println("\n----- Map Interface -----");
        Map<Integer, String> map = new HashMap<>();

        System.out.print("Enter the number of key-value pairs: ");
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            System.out.print("Enter Key (Integer): ");
            int key = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Value (String): ");
            String value = sc.nextLine();

            map.put(key, value);
        }

        System.out.println("\nMap Elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
