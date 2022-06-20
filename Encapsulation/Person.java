package Encapsulation;

public class Person {
    private String name;
    private String email;
    private Long age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(Long age){
        this.age = age;
    }
    public Long getAge(){
        return this.age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


