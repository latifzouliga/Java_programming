package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        // parse method: returns primitive type, converts strings to primitive values
        // valueOf method:returns wrapper class objects, converts strings to wrapper class value

        String str = "20";
        System.out.println(str + 1); // 201

       //Integer num = Integer.parseInt(str); // converting str to integer // unboxing
        int num = Integer.parseInt(str); // neither unboxing nor autoboxing
        System.out.println(num + 1);

        Integer num1 = Integer.valueOf(str);
        System.out.println(num1);

        System.out.println("------------------------------------------------------");

        String s = "50.5";

        double num2 = Double.parseDouble(s);  // primitive double

        Double num3 = Double.valueOf(s); // wrapper class double

        System.out.println(num2);
        System.out.println(num3);

        System.out.println("------------------------------------------------------");

        String x = "true";

        boolean r1  = Boolean.parseBoolean(x);  // primitive boolean
        Boolean r2 = Boolean.valueOf(x); // wrapper class boolean

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("------------------------------------------------------");

        // wrapper class unique characters

        // identify if a char is a digit
        char ch = '@';

        boolean isDigit = Character.isDigit(ch);

        boolean isLowerCase = Character.isLowerCase(ch);

        boolean isUpperCase = Character.isUpperCase(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch);

        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("isUpperCase = " + isUpperCase);

        System.out.println("isLowerCase = " + isLowerCase);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isDigit = " + isDigit);

        System.out.println("--------------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) { // convert string to charArray

            if(Character.isDigit(each)){  // check if char is a digit
               sum += Integer.parseInt(each+"");  // convert string to digit

            }
        }
        System.out.println("sum = " + sum);


    }
}
