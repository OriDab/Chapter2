import java.util.Scanner;

public class computingBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        int height = input.nextInt();
        double kg = pounds * 0.45359237;
        double meters = height * 0.0254;
        double bmi = kg / (meters * meters);

        System.out.print("BMI is " + String.format("%.4f", bmi));
    }
}
