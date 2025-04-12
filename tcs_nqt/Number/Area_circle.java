import java.util.Scanner;

public class Area_circle {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" raduis ");
            int r = sc.nextInt();
            final double pi = 3.14;
            double area = pi*(r*r);
            double circumference = 2*pi*r;
            System.out.println("area of circle "+  area);
            System.out.println("circumfernce of circle "+ circumference);


            }
}
