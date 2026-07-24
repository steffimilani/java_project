public class TimeComplexityDemo {
    public static void main(String[] args) {
        int n = 8;

        // O(n)
        System.out.println("O(n):");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // O(n²)
        System.out.println("\n\nO(n²):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        // O(2n)
        System.out.println("\nO(2n):");

        System.out.println("First Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nSecond Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // O(log n)
        System.out.println("\n\nO(log n):");
        for (int i = n; i >= 1; i = i / 2) {
            System.out.print(i + " ");
        }
    }
}