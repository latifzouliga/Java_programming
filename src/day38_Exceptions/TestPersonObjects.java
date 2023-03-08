package day38_Exceptions;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 32, 'Z');

        System.out.println(person1);

        /*
        try {
            person1.setAge(-125); // throw a runtime exception
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
         */

        System.out.println(person1);
    }
}
