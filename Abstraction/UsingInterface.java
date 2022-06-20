package Abstraction;
interface A{
    void a();
    void b();
    void c();

}
abstract class B implements A {
    public void c(){
        System.out.println("I am C");
    }
}

class M extends B {
    public void c() {
        System.out.println("I am C from M");
    }
    public void b(){
        System.out.println("I am B from M");
    }
    public void a(){
        System.out.println("I am A from M");
    }
}

class TestAbstraction{
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
    }
}
