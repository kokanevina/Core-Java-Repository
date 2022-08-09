

public class OverridingDemo {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.empId=123;
        emp.empName="Soham Maitri";
        emp.basicSalary=23000;
        System.out.println(emp); // call automatically goes to toString method  and string format of Employee object will be returned 
        // if available in class the that method called, if not available then super class method called
        double gs=emp.calGross();
        System.out.println("Gross salary is:"+emp.grossSalary);
        System.out.println("Gross salary is:"+gs);

        double ns=emp.calNet();
        System.out.println("Gross salary is:"+emp.netSalary);
        System.out.println("Gross salary is:"+ns);

        System.out.println("------Manager-------------");
        Manager mgr=new Manager();
        mgr.empName="Akshat";
        mgr.empId=4455;
        mgr.basicSalary=45000;
        mgr.setBranch("Sales");
        System.out.println(mgr); // manager toString

        double gsm=mgr.calGross(); // call goes to subclass overriding method 
        System.out.println("Gross salary is:"+mgr.grossSalary);
        System.out.println("Gross salary is:"+gsm);

        double nsm=mgr.calNet();
        System.out.println("Net salary is:"+mgr.netSalary);
        System.out.println("Net salary is:"+nsm);

       /*  emp->Employee Object
        mgr->Manager Object */
        showGross(emp);
        showGross(mgr);
    }
    public static void showGross(Employee e){
        System.out.println(e.getClass());
        System.out.println("Display fross salary of employee/manager");
        double gs=e.calGross();
        System.out.println("gross salary is :"+gs);
    }
}
