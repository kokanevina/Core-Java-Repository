public class Company {
    
    public Employee getEmployee(){
        return new Employee(123,"Komal",45000);
    }

    public Number getNumber(){
        return 56.7;
    }
}

 class NeoCompany extends Company{
    /* subclass overriding method can return object of subtype of superclass method return type */
    /*Manager and Employee are knows are co varients */    
    public Manager getEmployee(){
            return new Manager("HR", 111, "Pooja", 12000);
        }
/* Double and Number are co varients */
        public Double getNumber(){
            return 123.7;
        }
}
