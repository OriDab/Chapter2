import java.util.Scanner;

public class lengthEquilateralTriangle {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double length = input.nextDouble();

        double area = ((Math.sqrt(3)) / 4) * (length * length);
        double volume = area * length;

        System.out.println("The area is " + String.format("%.2f", area));
        System.out.print("The volume of the Triangular prism is " + String.format("%.2f", volume));
    }
}
