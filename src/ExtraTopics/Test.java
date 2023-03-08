package ExtraTopics;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] a = {100, 2, 23, 1, 34, 23, 12, 34};

        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            int k = i -1;
            while (k >= 0 && temp > a[k]){
                a[k+1] = a[k];
                a[k] = temp;
                k--;
            }

        }



        System.out.println(Arrays.toString(a));


    }
}












