package kataa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> colours = new PriorityQueue<>();
        colours.add("Blue");
        colours.add("Black");


        Map<String,Integer> map = new TreeMap<>();
        map.put("A",1);
        map.put("B",2);


        map.replace("A",3);


        System.out.println("from queue" + colours);
        System.out.println("from map" + map);

        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);

        System.out.println("from set->" + nums);
    }
}
