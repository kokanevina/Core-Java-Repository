
import mypack.Shapes;
import mypack.ThreeDShapes;
import mypack.mymath.Arithmetic;


//import mypack.*;   // a. 2 classes b. 3 classes Ans : a
public class PackageDemo {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        double areac=shapes.area(23);
        System.out.println(areac);
        ThreeDShapes td=new ThreeDShapes();
        double areas=td.area(23);
        System.out.println(areas);
        // Use Arithmetic
    }
}

