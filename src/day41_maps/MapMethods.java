package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        /** ---------------------------------- Map Methods --------------------------------------
         *  - put(key, value): inserts the given key and value
         *  - put(key, newValue): can be used for updating the value of an existing key
         *  - replace(key, newValue): used for replacing the value of an existing key, the same as put() method
         *  - size(): counts the number of keys
         *  - get(key): returns the value of a given key
         *  - remove(): removes a pair from a map
         *  - containsKey(): returns true if the key is contained in the map, otherwise returns false
         *  - containsValue(): returns true if the vale is contained in the map, otherwise returns false
         *
         */

        // keys can not be changed, but values can be changed
        Map<String, String > map = new TreeMap<>();

        map.put("C04", "Josh");
        map.put("D02", "Nora");
        map.put("F02", "Murat");
        map.put("E02", "Joshua");
        map.put("C01", "Tatiana");
        map.put("C02", "Abdullah");
        map.put("P01", "Tatiana");
        map.put("W01", "Tatiana");
        map.put("H01", "Tatiana");

        System.out.println(map.get("D02"));

        map.put("P01", "Lucy"); // change the value of "P01"
        map.put("W01","Madiyar");

        System.out.println(map);

        System.out.println(map.size());  // returns the number of keys

        System.out.println(map.get("W01"));

        map.replace("E02", "Ahmed");  // replaces a value, faster than put() method

        System.out.println(map);

        // removes the pair with the matching key from the map
        System.out.println(map.remove("H01")); // returns the removed value and decrease the size of map

        System.out.println(map);

        // containsKey for keys only
        System.out.println(map.containsKey("E02"));  // returns true if the key is contained in the map
        System.out.println(map.containsKey("HH1")); // returns false

        // containsValue for values only
        System.out.println(map.containsValue("Ahmed")); // returns true if the value is contained in the map
        System.out.println(map.containsValue("Hello")); // returns false

        System.out.println(map.isEmpty()); // returns boolean

        System.out.println(map.equals(map)); // returns boolean

        map.clear(); // sets the size to zero
        System.out.println(map); // {}

        System.out.println("-----------------------------------------------------------");

    }
}

/*
pair: id - name
 */