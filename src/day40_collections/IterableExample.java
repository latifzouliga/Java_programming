package day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // for each can remove al the objects that are less than 5 because index number keeps shifting
        /*
        //.ConcurrentModificationException
        for (Integer each : list) {
            if (each < 5){
                list.remove(each);
            }
        }
         */

        // does not remove all the objects that are less than 5 because the index number keeps shifting
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list); // [2, 4, 5, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7]

        System.out.println("--------------------------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // Removing element less than 5 using Iterator
        Iterator<Integer> it = list2.iterator(); // calling iterator method and assign it to Iterator variable

        // Removing element with while loop and Iterator
        while (it.hasNext()){   // hasNext() method
            Integer each = it.next();
            if (each < 5){
                it.remove();
            }
        }
        System.out.println(list2);  // [5, 5, 6, 7, 5, 6, 7]

        System.out.println("------------------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // Removing element with for i loop and Iterator
        for (Iterator<Integer> i = list3.iterator(); i.hasNext();){
            if (i.next() < 5){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("-------------------------------------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // Removing elements with removeIf() method that uses Iterator and lambda expression
        list4.removeIf(p -> p < 5);
        System.out.println(list4);

        System.out.println("--------------------------------------------------------------------");

        // RemoveIf() method can work for all the That have IS relationship with Iterator

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list5.removeIf( p -> p < 5);
        System.out.println(list5);



    }
}
