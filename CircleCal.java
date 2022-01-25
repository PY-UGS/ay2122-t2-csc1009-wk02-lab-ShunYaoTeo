import java.util.Scanner;

public class CircleCal {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of a Circle: ");
        float radius = input.nextFloat();
        double PI = 3.14159;
        double Area = radius * radius * PI;
        System.out.format("The Area of your Circle is %10f",Area);
        /*System.out.println(Area);*/


    }
}
