package day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {


        Pizza cheesePizza = new Pizza();

        //cheesePizza.size = 'm';
        cheesePizza.setInfo('s', 1, 2);

        Pizza pizza2 = new Pizza();

        //pizza2.size = 'M';
        pizza2.setInfo('l', 2, 1);


        System.out.println("------------------------------------------------------");

       // using loop to create 60 pizza and calculating the total
        double total = 0;
        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s', 2, 2);
            total += small.calcCost();
            Pizza medium = new Pizza();
            medium.setInfo('m', 3, 5);
            total += medium.calcCost();
            Pizza large = new Pizza();
            large.setInfo('l', 2, 5);
            total += large.calcCost();

        }
        System.out.println(total);


    }

}
