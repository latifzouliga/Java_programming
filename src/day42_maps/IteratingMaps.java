package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {




        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        System.out.println("----------------------------- Iterate map by keys --------------------------------");

        // -------------------------------------- keySet() ------------------------------------------------

        for (String eachKey : map.keySet()) {       // keySet()
            //          key           value      *  2
            //map.replace(eachKey, map.get(eachKey) * 2); // replacing old value with new value
            System.out.println(eachKey);  // prints the keys of map
        }
        System.out.println(map);

        System.out.println("----------------------------- Iterate map by values --------------------------------");

        //-------------------------------------------------  values() ------------------------------------------

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);  // prints the values of map
        }

        System.out.println("----------------------------- Iterate map by entries --------------------------------");

        //-------------------------------------------------  entrySet() ------------------------------------------

        // Entry is an inner interface of Map interface which means that we need to call it though Map
        // the data type for entrySet is Entry

        for (Map.Entry<String ,Integer> eachEntry  : map.entrySet()){
            System.out.println(eachEntry);  // prints pairs (Entries) or keys and values
        }
        System.out.println("--------------Iterate map by entries and get keys and values separately------------------");

        // entrySet()
        // getValue()
        // getKey()
        // setValue()

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            String eachKey = eachEntry.getKey(); // returns each key             // getKey()
            Integer eachValue = eachEntry.getValue(); // returns each value      // getValue()

            eachEntry.setValue(eachValue + 10005);  //change the value            // setValue()

            System.out.println(eachKey+ " : "+eachValue);

        }
        System.out.println(map);






    }
}
