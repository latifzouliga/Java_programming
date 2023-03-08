package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.DoubleToLongFunction;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        // this is an array of maps, the data type is Map
        Map<String, Object>[] arrayOfMaps = new Map[5];

        arrayOfMaps[0] = person1;
        arrayOfMaps[1] = person2;
        arrayOfMaps[2] = person3;
        arrayOfMaps[3] = person4;
        arrayOfMaps[4] = person5;
        // arrayOfMap[5] = new LinkedHashMap<>();  // index out bound exception

        System.out.println(Arrays.toString(arrayOfMaps));

        System.out.println("-------------------Increase the salary of the second person by 10k----------------------");

        // down casting salary value from Object type to Integer
        arrayOfMaps[1].replace("salary",(Integer)arrayOfMaps[1].get("salary")+ 10000);

        System.out.println(arrayOfMaps[1]);
        System.out.println(arrayOfMaps[1].get("salary"));

        System.out.println("-------------------Change the name pf the person 1 --------------------------------------");

        arrayOfMaps[0].replace("name","Hassan");

        System.out.println(arrayOfMaps[0]);     // printing person map
        System.out.println(arrayOfMaps[0].get("name")); // printing the name of person 1

        System.out.println("-----------------count persons with salary less 100k--------------------------------------");

        int count = 0;

        for (Map<String, Object> eachMap : arrayOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("salary")){
                    if ((Integer)eachEntry.getValue() < 100000){
                        System.out.println(eachMap.get("name"));
                        count++;
                    }
                }
            }
        }
        System.out.println(count);




    }
}