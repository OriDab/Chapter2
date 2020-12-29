import java.util.Scanner;

public class runawayLength {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        int speed = input.nextInt();
        double acceleration = input.nextDouble();
        double length = (speed * speed) / (2 * acceleration);

        System.out.print("The minimum runaway length for this airplane is " + String.format("%.3f", length));
    }
}
