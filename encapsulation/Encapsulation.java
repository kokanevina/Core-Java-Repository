
class Employee{
    private int empId; /* private variables not accessible outside of class */
    private String firstName,lastName;
    private double empSalary;

    String getDetails(){  
        return "Id :"+empId+" Name:"+firstName+" "+lastName+" Salary:"+empSalary;
    }
    String getName(){
        return firstName+" "+lastName;       
    }
    /*public interface */

    /*getter is used to get the value outside */
    public int getEmpId(){ 
        return empId;
    }
     /*setter is used to change/set the value from outside */
    public void setEmpId(int empId){
        this.empId=empId;
    }
  
     public String getFirstName(){
        return firstName;
     }
     public void setFirstName(String firstName){
        this.firstName=firstName;
     }
}

public class Encapsulation{
    public static void main(String[] args) {    
        Employee emp1; /* this varible will point to object of type Employee */
        emp1=new Employee();// default constructor
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getFirstName());
        System.out.println(emp1.lastName);
        System.out.println(emp1.empSalary);
        String details=emp1.getDetails();
        System.out.println(details);
        emp1.setEmpId(120);
        emp1.setFirstName("Hari");
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