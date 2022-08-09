public class UpcastingDemo {
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp);
        double gs=emp.calGross();
        System.out.println("Gross salary is:"+gs);
        double ns=emp.calNet();
        System.out.println("Net salary is:"+ns);
        System.out.println("------Manager-------------");
        Manager mgr=new Manager("Sales",112,"Hari",34000); 
        System.out.println(mgr); 
        double gsm=mgr.calGross(); 
        System.out.println("Gross salary is:"+gsm);
        double nsm=mgr.calNet();
        System.out.println("Net salary is:"+nsm);
       

        Employee e;
        //e=(Employee)new Manager("Marketting",333,"KAJAL",14000); // u can call any type of constructor
        /*upcasting : own prperties not visible, but overriding methds visible*/
        e=new Manager("Marketting",333,"KAJAL",14000);
        /* downcasting */
        Manager mg=(Manager)e; // we can downcast upcasted object
        Manager mm=(Manager) new Employee(); // we can not downcast super class object
        

        Employee ee;
        ee=emp;  // left side same, right side getting changed with diff objects
        ee.calGross();
        ee=mgr;
        ee.calGross();
    }
}
