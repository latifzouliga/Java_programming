package Day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "CUDEO SCHOOL"; // cydeo school
        str = str.toLowerCase();
        System.out.println(str);

        String str2 = "java programming";
        str2 = str2.toUpperCase(); // JAVA PROGRAMMING

        //-----------------------------------------------------

        String word ="Wooden Spoon";

        word = word.toLowerCase(); // wooden spoon

        word = word.toUpperCase(); // WOODEN SPOON

        System.out.println(word); // final value is "WOODEN SPOON"

        //---------------------  Trim()  -------------------------
        // white spaces are the spaces that are not needed

        String str4 = "           Cydeo School   ";

        str4 = str4.trim();  // to exclude white spaces

        System.out.println(str4); // "Cydeo School"

        //---------------------   indexOf()  ---------------------
        // returns the index number of a specified character

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');// looks for a character from left to right to find the first matching one

        System.out.println(index1); // the index number of 'w' is 21

        String s1 = "I  love Java Programming";

        int firstA = s1.indexOf('a'); // returns the index number of the first 'a'

        System.out.println(firstA); // 9

        int secondA = s1.indexOf("av"); // returns the index  of 'a' by checking the next character

        String s2 = "Java Paython JavaScript Cydeo Python";

        int a1 = s2.indexOf('a'); // returns the index of first 'a'

        System.out.println(a1);

        int a2 = s2.indexOf("a Python"); // returns the index of second a

        int a3 = s2.indexOf("avaS"); // returns the index of third a

        int a4 = s2.indexOf("aS"); // returns the index of fourth a

        //-----------------------------------  lastIndex() --------------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a'));  // start from left to right and get the index of the first matching character

        System.out.println(w.lastIndexOf('a'));// start from right to left and get the index of the first matching character

        String w2 = "Java Paython JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));



    }

}
