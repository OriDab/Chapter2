import java.util.Scanner;

public class areaHexagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double length = input.nextDouble();
        double area = (3 * Math.sqrt(3)) / 2 * (length * length);
        System.out.print("The area of the hexagon is " + String.format("%.4f", area));
    }
}
