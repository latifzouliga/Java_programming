package day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }

        System.out.println("----------------------------------------------------------------------");

        // for each loop is used for data structure (Array, map and collection)
        // for each loop can not be used to reverse an array
        // for each loop does not use index but instead the number of the elements of data structure
        // anything thing that can be done by for each loop also can be done by for loop
        //


        for (int each: numbers){

            System.out.println(each);
        }





    }


}
