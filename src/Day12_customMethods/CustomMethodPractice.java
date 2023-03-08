package Day12_customMethods;

public class CustomMethodPractice {

    public static void main(String[] args) {


        maxNumber(4.6,10);

        System.out.println("-------------------------------");

        maxNumber(344,455);

        System.out.println("----------------------------------");

        maxNumber(10,10);

        System.out.println("----------------------------------");

        initial("Abdellatif", "Zouliga");

        System.out.println("-----------------------------------");

        initial("zouliga","abdellatif");


    }

    public static void maxNumber(double num1, double num2) {

        if (num1 > num1) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }




    }

    //Create a method tha can display the initials of a person (firstNme, lastName)

    public static void initial(String firstName, String lastName){

        // Abdellatif Zouliga

         //String initial = firstName.charAt(0) + "."+ lastName.charAt(0);
         String initial1 = firstName.substring(0,1).toUpperCase() +"."+ lastName.substring(0,1).toUpperCase();

        //System.out.println("Initial is: " + initial);
        System.out.println("Initial is: " + initial1);



    }



}
