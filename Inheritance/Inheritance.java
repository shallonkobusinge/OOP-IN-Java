package Inheritance;

import Inheritance.multilevel.BabyDog;
import Inheritance.single.Animal;
import Inheritance.single.Cat;

public class Inheritance {

    public static void main(String[] args) {
        /**
         * =====SINGLE INHERITANCE
         *
         * */
        Animal animal = new Animal();
        animal.eat();
        Cat cat = new Cat();
        cat.eat();
        cat.speak();

        /*
        * ==== MULTILEVEL INHERITANCE
        *
        * */
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
    }
}
