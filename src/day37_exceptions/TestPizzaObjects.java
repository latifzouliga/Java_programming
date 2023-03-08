package day37_exceptions;

import day31_inheritance.shapeMethodOverridding.Circle;

public class TestPizzaObjects {

    public  void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,2);

        Pizza pizza2 = new Pizza('S',2,2);

        Pizza pizza3 = new Pizza('M',3,3);

        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('M',3,3); // upcasting

        boolean r = obj.equals(pizza3);

        System.out.println(r);

        double total = ((Pizza)obj).calcCost(); // down casting to access Pizza methods

        System.out.println(total);

        // double area = ((Circle)obj).area(); // class cast exception

        // System.out.println(area);

        TestPizzaObjects main = new TestPizzaObjects();


        main.main((String[]) obj);
        main.main(args);


    }

}
