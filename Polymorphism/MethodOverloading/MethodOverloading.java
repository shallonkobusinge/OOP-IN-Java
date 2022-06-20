package Polymorphism.MethodOverloading;

public class MethodOverloading {
    // overloading by change of data type of parameters
        public Integer add(Integer num1, Integer num2){
            return (num1+num2);
        }
        public Double add(Double num1, Double num2){
            return (num1+num2);
        }
        public int add(int num1, int num2){
            return (num1+num2);
        }

        // overloading by the change of the number of parameters
    public void display(int a){
        System.out.println("Arguments "+a);
    }
    public void display(int a, int b){
        System.out.println("Arguments: "+a+"  and  "+b);
    }

}
