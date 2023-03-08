package day32_finalKeyword;

import java.time.LocalDate;


class  CydeoStudent{

    public final void language(){
        System.out.println("Java Programming");
    }

}

public final class FinalKeyword extends CydeoStudent{  // can never be parent class because of the final keyword

    /*
    public void language(){     // compiler error
        System.out.println("Python Programming");
    }

 */    // final methods can never be overridden

    public FinalKeyword(){  // constructor can not have final keyword

    }

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);  // M

        // gender = 'F';  // compiler error

        System.out.println(gender); // F

        System.out.println("------------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        System.out.println("------------------------------------------------");

        new CydeoStudent().language(); // parent class

        new FinalKeyword().language(); // child class object

        System.out.println("------------------------------------------------");

        final String name = "James"; // final prevents variable from being eligible for garbage collection
        // name = null;   // eligible for garbage collection
        // name = "Daniel";


        System.out.println(name);


    }
}
