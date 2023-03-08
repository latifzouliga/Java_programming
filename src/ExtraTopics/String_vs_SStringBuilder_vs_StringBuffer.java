package ExtraTopics;

import java.util.concurrent.Callable;

public class String_vs_SStringBuilder_vs_StringBuffer {

    public static void main(String[] args) throws Exception {

        /** string, stringBuilder and stringBuffer, all implement char sequence interface
           - String class is immutable, once object is created it can not be modified
             there are two ways to create string objects: by string literal or by new keyword
           - StringBuilder is mutable and is not synchronized.
           - StringBuffer is mutable but it is synchronized.
           - */

        System.out.println("------------String class-------------------");

        String str = "Wooden Spoon";  //
        str.concat(" Spoon"); // Wooden Spoon // this is another string

        String str1 = new String("Hello Java");

        System.out.println("------------StringBuilder-----------");

        StringBuilder aa = new StringBuilder("Wooden Spoon");

        StringBuilder b = aa.reverse(); // it does not create new stringBuilder, it just modifies it

        System.out.println(b);  // noopS nedooW

        System.out.println(b.length()); // 12
        aa.append(4);

        System.out.println(aa);  // noopS nedooW4

        System.out.println(aa.appendCodePoint(9));

        System.out.println(aa.indexOf("5")); // 13






    }
}
