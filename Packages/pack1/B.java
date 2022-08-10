package pack1;

public class B {
    public void test2(){
        A a=new A();
        //System.out.println(a.i); // privates accessed only within class
        System.out.println(a.j); // def accessible within the package
        System.out.println(a.k); // non subclass same package
        System.out.println(a.l); // public visible everywhere
    }
}
