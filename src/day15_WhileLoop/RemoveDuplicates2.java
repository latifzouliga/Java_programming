package day15_WhileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzzyxzyx";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) { // if the character is already contained in new string
                continue; // skip it
            }
            result += str.charAt(i); // concatenating characters to result
        }
        System.out.println(result);



    }
}
