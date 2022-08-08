import java.util.Scanner;

class Shape2{
    double area(float radius){
        return 3.142*radius*radius;
    }
}

public class Typecasting {
    public static void main(String[] args) {
        Shape2 sh=new Shape2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double r=sc.nextDouble();
        float rr=(float)r; /* typecasting : higher to lower  */
        sh.area(rr); 
    }
}
