package day21_multiDimentianlArray;

import java.util.Arrays;

public class MultiDimensionalPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "John", "Daniel"};
        String[] group2 = {"Rado", "Mike", "Cristina"};
        String[] group3 = {"Robin", "Jashua", "Mohammed"};
        String[] group4 = {"Ahmed", "Morad", "Halima"};

        String[][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            String[] each = groups[i];
            System.out.println(Arrays.toString(each));
            for (int j = 0; j < each.length; j++) {
                String eachStudent = each[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------------------------------");

        for (String[] each : groups) {
            System.out.println(Arrays.toString(each));
            for (String eachStudent : each) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------------------------------");

        // mixing for i loop and for each loop
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

        System.out.println(Arrays.deepToString(groups)); // deepToString() ==>  for Multi-Dimensional array









    }
}
