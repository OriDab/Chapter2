import java.util.Scanner;

public class physicsAcceleration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v initial: ");
        double vInt = input.nextDouble();
        System.out.print("Enter v final: ");
        double vFinal = input.nextDouble();
        System.out.print("Enter the time in seconds of the duration: ");
        double time = input.nextDouble();
        double area = (vFinal - vInt) / time;

        System.out.println("The average acceleration is " + String.format("%.4f", area));
    }
}
