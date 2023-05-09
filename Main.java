package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<Integer, String>();
                myMap.put(1, "value1");
                myMap.put(2, "value2");
                myMap.put(3, "value3");
                myMap.put(999, "value999");
                printMap(myMap);
    }
        public static void printMap(Map<Integer, String> map) {
            var sortedArray = map.entrySet().stream().sorted(
                    (e1, e2) -> e1.getValue().compareTo(e2.getValue())
            ).toList();

    for (var entry: sortedArray) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
