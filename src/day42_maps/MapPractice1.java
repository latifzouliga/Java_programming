package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("-----------------------------------------------------------------------------------------");

         /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
        */  // this is not the best way to get each value

        int countF = 0, countM = 0;
        for (String each : employeeMap.values()) {
            if (each.equals("M")){
                countM++;
            }else {
                countF++;
            }
        }
        System.out.println("Male employees number: "+ countM);
        System.out.println("Females employees number: "+ countF);

        System.out.println("-----------------------------------------------------------------------------------------");

        // display the names of female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if (gender.equals("F")){
                System.out.println(name);
            }
        }
         */

        //                            key & value
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")){  // value
                System.out.println(eachEntry.getKey()); // key
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // update all the "M" values with "Male" and all the "F" with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else {
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);


    }
}
