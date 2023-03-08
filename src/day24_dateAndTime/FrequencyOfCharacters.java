package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {


    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        String result = "";    //a3b4c5

      // can not use toCharArray because it returns  a primitive data type
        //                 split() method to convert string to an array
        for (String each : str.split("")) {

            //              converting an array to Collections type so that we can use frequency() method
            int frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );

            if(!result.contains(each)){
                result += each + frequency;
            }

        }


        System.out.println(result);


    }


}