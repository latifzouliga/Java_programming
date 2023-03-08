package day15_WhileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "wwkkflkdfaaaaa12121";

        String result = ""; //"abc

        for (int i = 0; i < str.length() ; i++) {  // i: index numbers of str

            char each = str.charAt(i); // each character if the String str

            if(!result.contains(""+each)){ // if the result does not contain the character of string str yet
                result += each; // then we will add the character to the String result
            }
            //if the character is not contained yet in the new string, then we will add it to the new string

        }
        System.out.println(result);

    }


}
