/* java is case sensitive */
class Employee{  /* Capitcal case */
    /* primitive data types
     * byte, short, int , long
     * float, double
     * char : single character
     * boolean  : 0/1 : false, true
    */
    /* String : class*/
    /*private, [default], protected, public */
    int empId;  /*camel case */
    String firstName,lastName;
    double empSalary;

    String getDetails(){  /* camel case */
        return "Id :"+empId+" Name:"+firstName+" "+lastName+" Salary:"+empSalary;
    }

    String getName(){
        int a; /* no default value ofr local variables, it must be initialized before use */
       // System.out.println(a);
        return firstName+" "+lastName;
    }
}


public class ClassDemo{
    public static void main(String[] args) {
        
        Employee emp1; /* this varible will point to object of type Employee */
        emp1=new Employee();// default constructor
        System.out.println(emp1.empId);
        System.out.println(emp1.firstName);
        System.out.println(emp1.lastName);
        System.out.println(emp1.empSalary);
        String details=emp1.getDetails();
        System.out.println(details);
        emp1.empId=120;
        emp1.firstName="Hari";
        emp1.lastName="Kumar";
        emp1.empSalary=45000;
        System.out.println(emp1.empId);
        System.out.println(emp1.firstName);
        System.out.println(emp1.lastName);
        System.out.println(emp1.empSalary);
        details=emp1.getDetails();
        System.out.println(details);
    }
}