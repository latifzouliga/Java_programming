package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        Map<String , Integer> map = new LinkedHashMap<>();

        String str = "aabcccdeeeef";

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            if (frequency == 1){
                map.put(each,frequency);
            }
        }
        System.out.println(map);
    }
}
/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}
 */