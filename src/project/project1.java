import java.util.Scanner;

public class CinemaSnackBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        int total = 0;
        char more;

        do {
            System.out.println("\n===== CINEMA SNACK MENU =====");
            System.out.println("1. Popcorn        - Rs.150");
            System.out.println("2. Coke           - Rs.80");
            System.out.println("3. Nachos         - Rs.120");
            System.out.println("4. Burger         - Rs.200");
            System.out.println("5. French Fries   - Rs.100");

            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            switch (choice) {
                case 1:
                    total += 150 * quantity;
                    System.out.println("Popcorn added.");
                    break;

                case 2:
                    total += 80 * quantity;
                    System.out.println("Coke added.");
                    break;

                case 3:
                    total += 120 * quantity;
                    System.out.println("Nachos added.");
                    break;

                case 4:
                    total += 200 * quantity;
                    System.out.println("Burger added.");
                    break;

                case 5:
                    total += 100 * quantity;
                    System.out.println("French Fries added.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to order more? (Y/N): ");
            more = sc.next().charAt(0);

        } while (more == 'Y' || more == 'y');

        System.out.println("\n==============================");
        System.out.println("      CINEMA SNACK BILL");
        System.out.println("==============================");
        System.out.println("Total Amount : Rs." + total);
        System.out.println("Thank You! Enjoy Your Movie!");
        System.out.println("==============================");

        sc.close();
    }
}
