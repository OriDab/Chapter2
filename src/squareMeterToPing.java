import java.util.Scanner;

public class squareMeterToPing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final double pingConvert = 0.3025;

        System.out.print("Enter a number in square meters: ");
        double meters = input.nextDouble();
        double ping = pingConvert * meters;

        System.out.println(meters + " square meters is " + ping + " pings");
    }

}
