package ExtraTopics.generic_Methods_And_Classes;

import java.util.List;

public  class  GenericClass<Thing>{

    // if the class is generic, there is no need to apply generic type to methods
    // if the class id generic, methods must be instance methods
    // if the class is generic, we must create an object and specify the data type

    public void printEach(Thing[] things){

        for (Thing thing : things) {
            System.out.println(thing);
        }

    }

    // generic method for any given list
    public  void printEach(List<Thing> things){

        for (Thing each : things) {
            System.out.println(each);
        }
    }
}
