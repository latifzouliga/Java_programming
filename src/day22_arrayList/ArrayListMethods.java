package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        //--------------------------------------- add() --------------------------------------------

        ArrayList<Integer> list = new ArrayList<>();
                      //  index
        list.add(10); //   0
        list.add(20); //   1
        list.add(30); //   2
        list.add(10); //   3
        //list.add(5.5)// compiler error because add() is demanding Integer

        System.out.println(list);  // [10, 20, 30, 10]

        //  insert an element to a specific index
        list.add(1,15);

        System.out.println(list);  // [10, 15, 20, 30, 10]

        //  insert an element to a specific index and the rest of the elements will shift to the right
        list.add(2,25);

        System.out.println(list); // [10, 15, 25, 20, 30, 10]

        //--------------------------------------- get() --------------------------------------------

        // get() method gets the elements by its index

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Abdelatif");
        studentList.add("Latif");
        studentList.add("Zouliga");
        studentList.add("Zaid");

        System.out.println(studentList.size()); // 4

        System.out.println(studentList);     //     [Abdelatif, Latif, Zouliga, Zaid]

        String firstStudent = studentList.get(0);

        System.out.println(firstStudent);        //  Abdelatif

        String  lastStudent = studentList.get(studentList.size() - 1);

        System.out.println(lastStudent);  // Zaid




    }



}
