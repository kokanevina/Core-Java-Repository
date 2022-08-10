// every class in java extends Object class implicitly directly/indirectly.
/*1. final methods of class can not be overriden in subclass
 * 2. final classes can not be inherited
 */
// whether final class can be a subclass of any class? : YES
final class Father extends Object{
    public  String dream(){
        return "Doctor";
    }
}
class Mother{
    public final String dream(){
        return "Engineer";
    }
}

class Child extends Mother{
   /* Cannot override the final method of superclass*/
    public String dream(){
        return "Lawyer";
    }
}
class Child2 extends Father{
    public String dream(){
        return "xyz";
    }
}


public class FinalDemo {
    public static void main(String[] args) {
        final int a=10;
         //a=45;
        System.out.println(a);

        Child c=new Child();
        String drm=c.dream(); 
        System.out.println(drm);
        LocalTrain lt1=new LocalTrain("Thane", "Vashi");
        LocalTrain lt2=new LocalTrain("Thane", "Panvel");
     //   lt1.trainSource="Panvel"; // state change
       // lt1.trainDestination="Thane";
        final LocalTrain lt3=new LocalTrain("Dadar", "Virar");
        //lt3=new LocalTrain("xyz", "aaa");

        LocalTrain lt4=lt3; // whether new object created or not?: No
        System.out.println(lt1.trainDestination);
        System.out.println(lt4.trainDestination);

    }
}

 class LocalTrain{
    final String trainSource;
    final String trainDestination;

    public LocalTrain(String ts, String td){
        trainSource=ts;
        trainDestination=td;
    }
    public void setTrainSource(String ts){
       // trainSource=ts;  // state change
    }
 }

 
 
 
