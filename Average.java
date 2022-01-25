import java.util.Scanner;
public class Average {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers of your choice: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float aver = (num1 + num2 + num3)/3;
        System.out.format("The average of these 3 numbers are: %f",aver);

    }
}