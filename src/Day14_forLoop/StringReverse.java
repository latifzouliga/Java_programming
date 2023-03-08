package Day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java is good";

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);  // storing the i result in variable

            //System.out.print(str.charAt(i )+ " ");

        }
        System.out.println(reverse);

        System.out.println("----------------------------------------------");

        String name = "Abdellatif Zouliga";

        System.out.println(reverse(name));




    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            // to get the index nums of the string starting from last index to index 0

            reverse += str.charAt(i);
            // to get each character of the string starting from last index to index 0 and concatenating them

        }

        return reverse;



    }




}
