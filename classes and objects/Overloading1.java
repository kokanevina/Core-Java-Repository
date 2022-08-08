
import java.util.Scanner;
// lang package is by default imported
class Shape1{

    double area(double radius){
        System.out.println("inside circle method"+radius);
        return 3.142*radius*radius;
    }
    double area(double length,double breadth){
        return  length*breadth;
    }
    double area(float side){
        System.out.println("inside square method"+side);
        return side*side;
    }
    //double area(double side1, double side2, double side3){
     //   Math.sqrt();
   // }
}





public class Overloading1 {
   public static void main(String[] args) {
    Shape1 shape=new Shape1();
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter radius");
    int r=scanner.nextInt();
    double areacircle=shape.area(r); //  area(int) long, float, double==> float area(float)
    System.out.println("Area if circle is "+areacircle);
    /* 1. number of parameters shuld be diff or 2. if same then data type should be dift */
    System.out.println("Enter length and breadth of rectangle");
    double length=scanner.nextDouble();
    double breadth=scanner.nextDouble();
    double arearect=shape.area(length,breadth);
    System.out.println("Area if rectangle is "+arearect);
    System.out.println("Enter side of square");
    int s=scanner.nextInt();
    double areasqr=shape.area(s);
    System.out.println("Area if square is "+areasqr);
   } 
}
