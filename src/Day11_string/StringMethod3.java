package Day11_string;

public class StringMethod3 {

    public static void main(String[] args) {

        //------------------------- isEmpty()------------------------

        // returns true or false

        String word = ""; // this is an empty string

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        //------------------------- isBlank() ------------------------

        // returns true or false

        String str = "                "; // this is an blank string

        boolean r2 = str.isBlank();

        boolean r3 = str.isEmpty();

        System.out.println(r2);

        System.out.println(r3);

        //------------------------- equals() ------------------------

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);  // false

        System.out.println(str1.equals(str2)); // true

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3)); //false // case sensitive

        //------------------------- equalsIgnoreCase() ------------------------

        String s1 = "JAVA";

        String s2 = "java";

        System.out.println(s1.equals(s2)); // false // different cases

        System.out.println(s1.equalsIgnoreCase(s2)); // true

        //------------------------- contain() ------------------------

        // it checks if a string is included in other string and returnes true or false

        String students = "Hasan Naran Sumeve Nataliia";

        boolean hasAhmad = students.contains("Ahmad");

        System.out.println(hasAhmad);

        String sentence = "My favorate programming language is JAVA";

        Boolean hasJava = sentence.toLowerCase().contains("java"); // to ignore case sensitivity

        //------------------------- startWith() ------------------------

        // checks if a string start with a specific character

        String name = "Micheal";

        boolean l = name.startsWith("Da");

        System.out.println(l); // false

        String url = "www.Cydeo.com";

        boolean isValid = url.startsWith("www."); // true

        System.out.println(isValid);


        //------------------------- endWith() ------------------------

        // checks if a string with a specific character

        boolean t = url.endsWith(".com"); // true

        System.out.println(t);

        String email = "zouliga138465gh@gmail.com";

        boolean isGmail = email.endsWith("gmail.com"); // true

        boolean isYahoo = email.endsWith("yahoo.com");// false

        boolean isHotmail = email.endsWith("hotmail.com");// false

        System.out.println("isHotmail = " + isHotmail);

        System.out.println("isYahoo = " + isYahoo);

        System.out.println("isGmail = " + isGmail);









    }
}
