package day42_maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            map.put(each.charAt(0), frequency);
        }

        System.out.println(map);  // {b=2, c=3, a=4}


    }
}

/*
 1. Write a program that can return the frequency of characters
      Not: MUST use map

       Ex:  str = "bbcccaaaa";

       Output: {b=2, c=3, a=4}
 */

// convert string to collection
