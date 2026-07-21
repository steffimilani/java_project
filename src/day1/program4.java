import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        int reverse = (ones * 100) + (tens * 10) + hundreds;

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}