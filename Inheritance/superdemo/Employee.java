public class Employee{
    public int empId;
    public String empName;
    public double basicSalary,grossSalary, netSalary;
    public double ta,da,hra,pf;
    protected final double pt=1200;
/* once we add own constr in class then java will stop providing a def constr */
    Employee(){
        System.out.println("In Employee d constr");
        empId=1;
        empName="AAA";
        basicSalary=1000;
    }
    Employee(int empId, String empName, double basicSalary){
        System.out.println("In Employee p constr");
        this.empId=empId;
        this.empName=empName;
        this.basicSalary=basicSalary;
    }
    public double calGross(){
        System.out.println("in Employee");
        ta=0.1*basicSalary;
        da=0.12*basicSalary;
        hra=0.2*basicSalary;
        grossSalary=basicSalary+ta+da+hra;
        return grossSalary;
    }
    public double calNet(){
        pf=0.06*basicSalary;
        netSalary=grossSalary-pt-pf;
        return netSalary;
    }
     public String toString(){
        return "id:"+empId+" name:"+empName+" basic salary:"+basicSalary;
    } 
}