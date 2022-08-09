public class InheritanceDemo {
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

        double gsm=mgr.calGross();
        System.out.println("Gross salary is:"+mgr.grossSalary);
        System.out.println("Gross salary is:"+gsm);

        double nsm=mgr.calNet();
        System.out.println("Gross salary is:"+mgr.netSalary);
        System.out.println("Gross salary is:"+nsm);

    }
}
