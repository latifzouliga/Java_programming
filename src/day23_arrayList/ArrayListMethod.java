package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        
        array[0] = 100;  // updating array elements

        System.out.println(Arrays.toString(array));   //  [100, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("---------------------------------------------------------------");

        //-------------------------------------------  add()  --------------------------------------------

        ArrayList<String> groceryList = new ArrayList();

        groceryList.add("Apple");
        groceryList.add("Chicken");
        groceryList.add("Potato");
        groceryList.add("Banana");
        groceryList.add("Pumpkin");
        groceryList.add("Beef");

        System.out.println(groceryList);  //  [Apple, Chicken, Potato, Banana, Pumpkin, Beef]

        System.out.println("======================================================================");

        //-------------------------------------------  set()  --------------------------------------------

        groceryList.set(2,"Cheese");  // updating arrayList // replace one element with another one

        System.out.println(groceryList);  //  [Apple, Chicken, Cheese, Banana, Pumpkin, Beef]

        groceryList.add(2,"Paper towel"); // inserting one element // ArrayList size changed

        System.out.println(groceryList);  // [Apple, Chicken, Paper towel, Cheese, Banana, Pumpkin, Beef]

        //-------------------------------------------  remove()  --------------------------------------------

        groceryList.remove(0);  // passing index 0 to remove element

        System.out.println(groceryList); // [Chicken, Paper towel, Cheese, Banana, Pumpkin, Beef]

        groceryList.remove("Chicken");  // passing an element directly to remove() method

        System.out.println(groceryList);  // [Paper towel, Cheese, Banana, Pumpkin, Beef]

        System.out.println("-------------------------------------------------------------------------------");

         ArrayList<Integer> number = new ArrayList<>();

         number.add(10);
         number.add(20);
         number.add(30);
         number.add(40);
         number.add(50);

         //number.remove(20); // takes ints as an index numbers by default // out of bound exception

        number.remove(Integer.valueOf(20)); // autoboxing int to Integer inorder to passing to remove() method

        System.out.println(number);  //  [10, 30, 40, 50]

        boolean r1 = number.remove(Integer.valueOf(40)); // returns true if an object is removed successfully

        System.out.println(r1);  // true

        //-------------------------------------------  clear()  --------------------------------------------

        number.clear();  // clear the list and returns an empty list

        System.out.println(number);  // []

        //------------------------------------ indexOf() lastIndexOf()  --------------------------------------------

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeya");
        names.add("Sumeya");
        names.add("Ali");
        names.add("Symeya");

        System.out.println(names.indexOf("Vasyl"));         // 0
        System.out.println(names.lastIndexOf("Vasyl"));  // 1
        System.out.println(names.lastIndexOf("Sumeya")); // 3

        //---------------------------------------------- contains()  ------------------------------------------------

        boolean hasMuhtar = names.contains("Muhtar");  // false
        boolean hasAli = names.contains("Ali");        // true

        System.out.println("hasMuhtar = " + hasMuhtar); // false
        System.out.println("hasAli = " + hasAli);       // true

        System.out.println("--------------------------------------------------------------------------------------");

        //----------------------------------------------- equals()  ------------------------------------------------

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;           // two variables referencing to the same object

        list1.add(10);

        System.out.println(list1);  // ]10]
        System.out.println(list2);  // [10]

        System.out.println(list1 == list2); // true  // because they're referencing to the same object

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(20);
        l2.add(20);

        System.out.println(l1);    // [20]
        System.out.println(l2);    // [20]

        System.out.println(l1 == l2);      // false

        System.out.println(l1.equals(l2));  // true

        System.out.println("------------------------------------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(20);
        n2.add(10);
        n2.add(30);













    }


}
