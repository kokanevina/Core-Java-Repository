import java.util.Scanner;

class Animal{

    public void eat(){
        System.out.println("Animal Eats");
    }
}
class HerbivousAnimal extends Animal{
    public void eat(){
        System.out.println("Herbivous Eat Veg");
    }
}
class Horse extends HerbivousAnimal{
    public void eat(){
        System.out.println("Horse Eat Gram");
    }
}
class CarnivorousAnimal extends Animal{
    public void eat(){
        System.out.println("Carnivorous Eat Non-Veg");
    }
}



public class UpcastingDemo1 {
    public static void main(String[] args) {
        Animal a=null;
        int ch=0;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("1:Animal 2: Herbi.. 3. Carni.. 4. Horse 5. Back");
        ch=sc.nextInt();
        switch(ch){
            case 1: a= new Animal();
                a.eat();
                break;
            case 2: a=new HerbivousAnimal();
                 a.eat();
                break;
            case 3: a=new CarnivorousAnimal();
                a.eat();
                break;  
            case 4: a=new Horse();
                a.eat();
            case 5: break; //Syste,.exit(0);
        }
        System.out.println(a.getClass()); // class name whose object is
    }
    while(ch!=5);
    System.out.println("Upcasting with Polymorphism done...");
    }
}
