import java.util.*;
public class Hashmap {

    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert   tc-O(1)
        hm.put("India", 200);
        hm.put("China", 100);
        hm.put("US", 150);

        System.out.println(hm);

        //Get operation  tc-O(1)
        int population=hm.get("India");
        System.out.println(population);

        //contains key tc-O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonasia"));

        //remove tc-O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Isempty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}

