package org.example;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
                myMap.put(1, "value1");
                myMap.put(2, "value2");
                myMap.put(3, "value3");
                myMap.put(999, "value999");
                printMap(myMap);
    }
        public static void printMap(Map<Integer, String> map) {
            for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}