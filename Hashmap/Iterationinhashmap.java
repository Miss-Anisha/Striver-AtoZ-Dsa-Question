import java.util.*;
public class Iterationinhashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 500);
        hm.put("China", 450);
        hm.put("US", 300);
        hm.put("Idonesia", 250);
        hm.put("Nepal", 200);

        //Iteration
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+ k + ",value"+hm.get(k));
        }
    }
}
//output=[China, Idonesia, US, Nepal, India]
//key=China,value450
//key=Idonesia,value250
//key=US,value300
//key=Nepal,value200
//key=India,value500
