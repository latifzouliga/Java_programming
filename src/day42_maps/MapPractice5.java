package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        // k and v are variable that represent all  keys and values in map
        // if there is more than one code fragment that needs to be passed
        // into lambda expression we need to use curly braces {}
        map.forEach((k, v) -> System.out.println(k + " : " + v));  // lambda expression



    }

}
