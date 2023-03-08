package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        /**------------------------------------------  Map -----------------------------------------------
         *   - is collection of pairs ( Key & Value )
         *   - each pair is called one entry ( name Arthur )
         *   - Does not have IS A relation with collection
         *   - supports non-primitives only
         *   - size is dynamic
         *   - key must be unique, value can be duplicated
         */

        /**----------------------------------------- hashMap -----------------------------------------------
         *  order is random
         *  accepts null keyword as a key and also as a values
         */
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Danial", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Aaron", 78000);
        hashMap.put("chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 900000);

        System.out.println(hashMap);
        System.out.println("-------------------------------------------------------------------------------");


        /**----------------------------------------- LinkedHashMap ------------------------------------------
         *  child of hashMap
         *  keeps the insertion order
         *  accepts null key and null values
         */
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Danial", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Aaron", 78000);
        linkedHashMap.put("chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 900000);

        System.out.println(linkedHashMap);
        System.out.println("-----------------------------------------------------------------------------");

        /**----------------------------------------- TreeMap -----------------------------------------------
         *  keeps sorted order
         *  sorts by keys
         *  does not accept null as a key, accepts null values
         */
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Danial", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Aaron", 78000);
        treeMap.put("chris", null);
        treeMap.put("Breanna", null); //value can be null
        // treeMap.put(null,120000); key can not be null in tree map
        // treeMap.put(null,900000);

        System.out.println(treeMap);
        System.out.println("-------------------------------------------------------------------------------");

        /**----------------------------------------- hashMap -----------------------------------------------
         *  similar as hashMap
         *  maintains random order
         *  does not accept null key and value
         *  synchronized (Thread-safe)
         */
        Map<String, Integer> hashTable = new Hashtable<>();


        hashTable.put("Danial", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Aaron", 78000);
        // hashTable.put("chris", null); // value in hashTable can not be null
        // hashTable.put("Breanna", null);
        // hashTable.put(null,120000); // key in hashTable can not be null

        // handling an unchecked exception // there is ONLY one to handle unchecked exception which is try & catch
        try {
            hashTable.put(null, 900000);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println(hashTable);
        System.out.println("-----------------------------------------------------------------------------");


    }
}
