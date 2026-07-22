import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Display
        System.out.println("ArrayList: " + list);

        // Get element
        System.out.println("First Element: " + list.get(0));

        // Update element
        list.set(1, "Mango");
        System.out.println("After Update: " + list);

        // Remove element
        list.remove(2);
        System.out.println("After Remove: " + list);

        // Size
        System.out.println("Size: " + list.size());

        // Check if element exists
        System.out.println("Contains Apple: " + list.contains("Apple"));

        // Traverse
        System.out.println("Elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}