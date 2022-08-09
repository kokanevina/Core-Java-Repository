public class Manager extends Employee{
    private String branch;
    public double fa;

    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
/* method name : same, 
   parameters : same no of p, same data type
 * scope: same, increased,  Cannot reduce the visibility of the inherited method
 * return type: primitive: same, Object: co varients allowed
 * */

    @Override
    public  double calGross(){
        /*fa is 15% of bs */
        System.out.println("in Manager");
        ta=0.1*basicSalary;
        da=0.12*basicSalary;
        hra=0.2*basicSalary;
        fa=0.15*basicSalary;
        grossSalary=basicSalary+ta+da+hra+fa;
        return grossSalary;
    } 
 
  /*   @Override
    public  double calGross(){
        /*fa is 15% of bs 
        System.out.println("in manager");
        fa=0.15*basicSalary;
        grossSalary=super.calGross()+fa;
        return grossSalary;
    }  */

  
    public String toString(){
        return super.toString()+" branch :"+branch;
    }
}
