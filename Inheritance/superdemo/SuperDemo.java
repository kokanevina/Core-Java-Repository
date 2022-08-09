

public class SuperDemo {
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp);
        double gs=emp.calGross();
        System.out.println("Gross salary is:"+gs);
        double ns=emp.calNet();
        System.out.println("Net salary is:"+ns);

        System.out.println("------Manager-------------");
        //ui : Scanner
        Manager mgr=new Manager("Sales",112,"Hari",34000); 
        System.out.println(mgr); 
        double gsm=mgr.calGross(); 
        System.out.println("Gross salary is:"+gsm);
        double nsm=mgr.calNet();
        System.out.println("Net salary is:"+nsm);
        System.out.println("--------------");
        SalesManager salesm=new SalesManager();
    }
    
}
