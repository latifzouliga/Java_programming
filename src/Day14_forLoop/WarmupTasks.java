package Day14_forLoop;

public class WarmupTasks {

    public static void main(String[] args) {

        String str3 = combine("one", "egg");
        System.out.println(str3);

        System.out.println("------------------------------------------");

        System.out.println(sumOf2IntNumbers(10,20));
        System.out.println(sumOf3Numbers(10,20,30));
        System.out.println(sumOf4Numbers(10,20,30,40));


    }

    public static String combine(String str1, String str2) {

        String result;

        // charAt accepts only chars, we need to convert it to String by concatenating Empty String
        if (str1.endsWith(""+str2.charAt(0))) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

        return result;

    } // combine to words

    public static int sumOf2IntNumbers(int n1, int n2){

        return n1 + n2;

    }  // sum of 2 numbers

    public static int sumOf3Numbers(int n1, int n2, int n3){

        //return n1 + n2 + n3;
        return sumOf2IntNumbers(n1,n2)+ n3;
    } // sum of 3 numbers


    public static int sumOf4Numbers(int n1,int n2, int n3, int n4){

        //return n1 + n2 + n3 + n4;

        //return sumOf3Numbers(n1,n2,n3) + n4;

        //return sumOf2IntNumbers(n1,n2) + sumOf2IntNumbers(n3,n4);

        return sumOf2IntNumbers(sumOf3Numbers(n1,n2,n3),n4);
    }  // sum of 4 numbers


}
/*
Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */