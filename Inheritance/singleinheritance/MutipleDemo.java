
class Father{
    public String dream(){
        return "Doctor";
    }
}
class Mother{
    public String dream(){
        return "Engineer";
    }
}

class Child extends Mother{

    public void callDream(){
        String drm=dream(); // ambiguity
    }
}



public class MutipleDemo {
    public static void main(String[] args) {
        Child c=new Child();
        c.dream();
    }
}
