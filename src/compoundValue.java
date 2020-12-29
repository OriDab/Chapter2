import java.util.Scanner;

public class compoundValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        int saveAmnt = input.nextInt();
        double monthOne = (saveAmnt * 0.003125) + 100;
        double monthTwo = (monthOne + 100) * (1 + 0.003125);
        double monthThree = (monthTwo + 100) * (1 + 0.003125);
        double monthFour = (monthThree + 100) * (1 + 0.003125);
        double monthFive = (monthFour + 100) * (1 + 0.003125);
        double monthSix = (monthFive + 100) * (1 + 0.003125);

        System.out.println("After the first month, the account value is $" + monthOne);
        System.out.println("After the Second month, the account value is $" + monthTwo);
        System.out.println("After the third month, the account value is $" + monthThree);
        System.out.println("After the sixth month, the account value is $" + monthSix);
    }

}
