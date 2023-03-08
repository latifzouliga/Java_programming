
package day17_customClass;

public class Dog {

    public String name;  // instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    //"Max" ,      "Husky",         'M",      4 ,       "small",      "White"
    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name;  // this keyword is used for calling the instance variable name
        this.breed =  breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    } // this method can help us to set all the information of the dog at once


    public void eat(){
        System.out.println(name +" is eating");
    }

    public void drink(){
        System.out.println(name +" is drinking water");
    }


    public String toString() { // to avoid getting hash-codes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }



}



        //in order to force compiler to use instance variable we need to use "this" keyword, otherwise it is just a local variable
        // from this   class (Dog), call instance variable for example (name) and assign it to an argument (name)
         // "this" keyword is used for calling the instance variable name

     // this method can help us to set al the information of the dog at once



    //-------------------------------------------------------------------------------------------
    // we need toString method in order to be able to print Dog object by passing it a print statement
    //  to avoid getting hash code when we print the class object
