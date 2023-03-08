package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Grey";

//----------------------------------------------------

        Dog dog2 = new Dog();

        dog2.name = "Bella";
        dog2.breed = "Goldeen retreaver";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "Black";

//----------------------------------------------------

        Dog dog3 = new Dog();

        dog3.setInfo("Loki","Chow Chow",'M',3,"Small","Orange");

//----------------------------------------------------

        Dog dog4 = new Dog();

        dog4.setInfo("Chuck","BullDog",'M',5,"Large","Black");

//----------------------------------------------------


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog3.eat();      // prints "Loki is eating"
        dog4.drink();    // prints "Chuck is drinking water"





    }
}
