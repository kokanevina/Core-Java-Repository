
/* in inheritance subclass object gets created, super class object get automatically created 
 * call goes to 1. Super class def constr, 2. supclass d/p construtor
 * if we want to called p contr of superclass via subclass then do constructor chaining in sbuclass 
 * constr using super keyword
*/
public class Manager extends Employee{
    public String branch;
    public double fa;
    public String departmentName="Sales";
    public Manager(){
        super(); // this call happens internally
        System.out.println("In Manager d constr");
        branch="XXX";
    }
    public Manager(String branch, int id, String name, double bsalary){
        super(id,name, bsalary); // explicit chaining, super stmt must be 1st stmt in constr
        System.out.println("In Manager p constr");
        this.branch=branch;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    @Override
    public  double calGross(){
        /*fa is 15% of bs */
        System.out.println("in Manager");
        ta=0.1*basicSalary;
        da=0.12*basicSalary;
        hra=0.2*basicSalary;
        fa=0.15*basicSalary;
        grossSalary=super.calGross()+fa;
        return grossSalary;
    } 
    public void displayDept(){
        System.out.println(departmentName);
        System.out.println(super.departmentName);
    }
    public String toString(){
        return super.toString()+" branch :"+branch;
    }
}
