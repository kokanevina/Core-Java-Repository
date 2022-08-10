package pack2;  // 1st stmt

import pack1.A;

public class D extends A{
    public void test3(){
        //System.out.println(i); // private
       // System.out.println(j); // default not accessible outside of package
        System.out.println(k); // protected are visible in subclass outside of package also
        System.out.println(l); 
    }
}
