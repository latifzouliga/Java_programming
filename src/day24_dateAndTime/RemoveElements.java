package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveElements {

    public static void main(String[] args) {

        //----------------------------------------- remove() vs removeIf() --------------------------------------------


        ArrayList<Integer> list = new ArrayList<>(); // 0~9
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list);            //  [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]

        //  should not use remove() method in  loop to remove elements
        // the size is automatically resized and the index numbers keeps shifting

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);

            }
        }

        System.out.println(list);           // [2, 4, 5, 6, 7, 2, 4, 5, 6, 7]

        System.out.println("-------------------------------------------------------------");

        // instead we need to use iterable to remove elements and since we haven't cover it yet
        // it is better to use removeI(), which uses iterable implicitly

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list2);         //  [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]

        list2.removeIf( p -> p < 4); // p: variable name, could be any variable // -> lambda expression

        System.out.println(list2);         // [4, 5, 6, 7, 4, 5, 6, 7]


        System.out.println("-------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C") );

        names.removeIf( each -> each.startsWith("J") );

        System.out.println(names);  // [Python, C#, Ruby, C++, C]

        System.out.println("-------------------------------------------------------------");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        employees.removeIf( p -> p.salary > 100000 );  // remove salary greater than 100000

        for (Employee each : employees) {
            System.out.println(each.name + " : "+each.salary);
        }
         // Josh : 100000.0
         // Emily : 90000.0
         // Bella : 95000.0



    }

}

/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */