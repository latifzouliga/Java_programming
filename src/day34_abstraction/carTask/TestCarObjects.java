package day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        //Car car = new Car("X6", "Red",2020,44000); // can not create objects form abstract class

        Honda honda1 = new Honda("Accord","Black", 2019,3500);
        Honda honda2 = new Honda("Accord","Black", 2019,3500);

        Audi audi = new Audi("Q6","Silver", 2020,45000);

        Tesla tesla1 = new Tesla("Model Y","Blue",2022,60000);
        Tesla tesla2 = new Tesla("Model Y","Blue",2022,60000);

        System.out.println("--------------------------------------------------------");

        // testing equal method
        System.out.println(honda1.equals(honda2));
        boolean tes = tesla1.equals(tesla2);
        System.out.println("Teslas: "+tes);

        System.out.println(honda1);
        System.out.println(audi);
        System.out.println(tesla1);

        System.out.println("----------------------------------");

        honda1.stop();
        audi.stop();
        tesla1.stop();

        System.out.println("------------------------------------");

        honda1.start();
        audi.start();
        tesla1.start();

        System.out.println("------------------------------------");

        audi.autoPark();
        tesla1.autoPilot();


    }
}
