package Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        System.out.println(overloading.add(25,30));
        System.out.println(overloading.add(127.5, 123.5));
        overloading.display(12);
        overloading.display(1,2);

    }
}
