package day31_inheritance.animal_methodOverRidding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily","Bengle",'F',3,"Medium", "Grey");

        Dog dog = new Dog("Max","Husky",'M',5,"Large","Black");

        Lion lion = new Lion("Simba","African Lion",'F',6,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","American Eagle",'M',2,"Small","Black and White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-------------------------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("--------------------------------------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();



    }
}
