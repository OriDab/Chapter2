import java.util.Scanner;

public class calculatingEnergy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterKg = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double tempInitial = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double tempFinal = input.nextDouble();
        double energy = waterKg * (tempFinal - tempInitial) * 4184;
        System.out.print("The energy needed is " + energy);
    }
}
