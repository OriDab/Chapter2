import java.util.Scanner;

public class minutesToYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int minutesToDays = (minutes / 60) / 24;
        int daysToYears = minutesToDays / 365;
        int daysRemain = minutesToDays % 365;

        System.out.println(minutes + " minutes is approximately " + daysToYears + " years and " + daysRemain + " days");
    }
}
