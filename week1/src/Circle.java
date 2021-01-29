import java.util.Scanner;

public class Circle {

    double radius=3;
    void getArea(double radius)
    {
        double v=3.14*radius*radius;
        System.out.println("the area is"+v);
    }
   void getPerimeter(double radius)
    {
        double v = 3.14 * 2 * radius;
        System.out.println("the permeter is"+v);
    }

    public static void main(String[] args) {
        Circle  circle=new Circle();
        Scanner in=new Scanner(System.in);
         double radius=in.nextDouble();
        circle.getArea(radius);
        circle.getPerimeter(radius);
    }



}
