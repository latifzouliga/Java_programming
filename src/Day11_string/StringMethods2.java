package Day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        //------------------------------  replace() --------------------------------
        // relpaces all matching sequance of characters

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python","Java");

        System.out.println(sentence);

        //-------------------------------------------------------------------------
        String word = "Java";

        // word = word.replace('a','i');

        word = word.replace("a","i"); // passing character as a string

        System.out.println(word);

        //----------------------------- replaceFirstOf() ---------------------------
        //replaces the first matching sequence of characters

        String sentence2 = "I love Java, Java is cool, Java is amazing";

        sentence2 = sentence2.replaceFirst("Java","Python");

        System.out.println(sentence2);

        //---------------------------------------------------------------------------

        String sentence3 = "Java is cool, Java is fun, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java",", Python");

        System.out.println(sentence3);

        //------------------------- substring() -----------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7,11);

        System.out.println(languageName);

        String days = "Today is Sunday, tomorrow is Monday";

        int chrIndex = days.indexOf('S');  // s index umber

        int charlstidx = days.indexOf("y, ");  // y index number

        System.out.println(chrIndex);

        System.out.println(charlstidx);

        String day = days.substring(9,14+1);

        System.out.println(day);

        //--------------------------------indexOf()----lastIndexOf()------------------------

        String email = "zouliga123434@yahoo.com";

        int beginnig = email.indexOf('@') + 1;

        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginnig,ending);

        System.out.println("domain "+domain);

        //------------------------------------------------------

        String sentence5 = "I love Java Programming";

        sentence5 = sentence5.substring(7);

        System.out.println("sentence5 "+sentence5);

        String sentence7 = "Today is Sunday, tomorrow is Monday";

        String tommorow = sentence7.substring(sentence7.lastIndexOf(" ") +1);

        System.out.println("tomorrow: "+tommorow);

        //--------------------------------------------------------

        String sentence8 = "I study at Cydeo School";

        String schoolName = sentence8.substring(sentence8.lastIndexOf("C"));

        System.out.println(schoolName);

        //------------------------- repeat() --------------------------------------

        String str = "Python";

        String result = (str+"\n").repeat(10);

        System.out.println(result);









    }
}
