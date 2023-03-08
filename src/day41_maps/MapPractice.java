package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public static void main(String[] args) {

        // key serves as index number
        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 45);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println(person1);

        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job_title"));

        System.out.println("------------------------------------------");

        Map<String, Object> person2 = new TreeMap<>();
        person2.putAll(person1);


    }
}
