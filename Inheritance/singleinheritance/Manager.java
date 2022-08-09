public class Manager extends Employee{
    private String branch;
    public double fa;

    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }

    /* public double calGross(){
        /*fa is 15% of bs
        ta=0.1*basicSalary;
        da=0.12*basicSalary;
        hra=0.2*basicSalary;
        fa=0.15*basicSalary;
        grossSalary=basicSalary+ta+da+hra+fa;
        return grossSalary;
    } */

    public String toString(){
        return super.toString()+" branch :"+branch;
    }
}
