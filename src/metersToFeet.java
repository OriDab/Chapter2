import java.util.Scanner;

public class metersToFeet {
    public static void main(String[] args){
        final double feetConvert = 3.2786;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();
        double feet = feetConvert * meters;

        System.out.println(meters + " meters is " + feet + " feet");
    }
}
