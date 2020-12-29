import java.util.Scanner;

public class tipCalculation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the subtotal of your check: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter in the gratuity rate percent: ");
        double gratuityPercent = input.nextDouble();

        double gratuityRateConvert = gratuityPercent / 100;
        double gratuityRate = subtotal * gratuityRateConvert;
        double total = gratuityRate + subtotal;

        System.out.println("The gratuity is $" + gratuityRate + " and total is $" + total);
    }
}
