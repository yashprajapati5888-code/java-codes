package abstraction.abstractone;

import java.sql.SQLOutput;

public class Dog extends Animal {
    public void sound(){
        System.out.println("Dog barks");

    }

    public static void main(String[] args) {
        Dog obj = new Dog();

        obj.sound();
    }
}
