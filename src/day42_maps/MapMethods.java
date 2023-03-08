package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        //---------------------------------------- putAll methods ------------------------------------------
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");


        Map<String, String> employees = new TreeMap<>();
        employees.putAll(map);  // copies the keys and values of a map and add to new map

        System.out.println(employees);

        System.out.println(map == employees); // false

        System.out.println(map.equals(employees)); // true




    }

}