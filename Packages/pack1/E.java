package pack1;

public class E extends A{
    public void test3(){
       // System.out.println(i);// privates accessed only within class
        System.out.println(j);
        System.out.println(k); // in suclass protected accessed directly
        System.out.println(l);
    }
}
