public class Employee{
    public int empId;
    public String empName;
    public double basicSalary,grossSalary, netSalary;
    public double ta,da,hra,pf;
    protected final double pt=1200;
    public double calGross(){
        // ta: 10% of bs, da:12% bs, hra: 20% bs
        // gs= bs+ta+da+hra
        System.out.println("in Employee");
        ta=0.1*basicSalary;
        da=0.12*basicSalary;
        hra=0.2*basicSalary;
        grossSalary=basicSalary+ta+da+hra;
        return grossSalary;
    }
    public double calNet(){
        // pt: 1200, pf:6% f bs      
        pf=0.06*basicSalary;
        netSalary=grossSalary-pt-pf;
        return netSalary;
    }
    /* used to represent the object in string format */
     public String toString(){
        return "id:"+empId+" name:"+empName+" basic salary:"+basicSalary;
    } 
}