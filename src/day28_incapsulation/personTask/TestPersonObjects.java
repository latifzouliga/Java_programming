package day28_incapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Mohammed");
        Person person2 = new Person("Abdellah", 'M');
        Person person3 = new Person("Hasan",30);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatania",25,'F');
        Person person6 = new Person("Lucy", 31,'F',"Engligh");


        person4.eat("Baklava");
        person1.name = "Ahmad";
        person2.drink("Water");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);




    }
}
