import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");   // Duplicate

        // Display
        System.out.println("Set: " + set);

        // Check element
        System.out.println("Contains Banana: " + set.contains("Banana"));

        // Remove element
        set.remove("Orange");
        System.out.println("After Remove: " + set);

        // Size
        System.out.println("Size: " + set.size());

        // Traverse
        System.out.println("Elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}