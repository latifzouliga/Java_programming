package day28_incapsulation.encapsulation;

public class Student {

    private  String name;
    private int age;

    public String getName() {

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                hasDigit = true;
                break;
            }
        }
        if(hasDigit){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge(){  // read only
        if(age == 0){
            System.err.println("Age is not set");

            System.exit(1);
        }
        return age;
    }

    public void setAge(int age){  // write only

        if (age < 1 || age > 100){
            System.err.println("Invalid age: "+ age);
            // return; Exits the method only
            System.exit(1); // Exits the whole program
        }
        this.age = age;

    }


}
