public class Company {
    
    public Employee getEmployee(){
        return new Employee();
    }

    public Number getNumber(){
        return 56.7;
    }
}

 class NeoCompany extends Company{
    /* subclass overriding method can return object of subtype of superclass method return type */
    /*Manager and Employee are knows are co varients */    
    public Manager getEmployee(){
            return new Manager();
        }
/* Double and Number are co varients */
        public Double getNumber(){
            return 123.7;
        }
}
