// Write a java program which implements the methods of Vector class



import java.util.Vector;

public class pr32 {
    public static void main(String[] args) {
        // Create a Vector
        Vector<Integer> vector = new Vector<>();

        // Add elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        System.out.println("Initial Vector: " + vector);

        // Insert an element at a specific position
        vector.add(2, 25);
        System.out.println("After inserting 25 at index 2: " + vector);

        // Remove element by index
        vector.remove(1);
        System.out.println("After removing element at index 1: " + vector);

        // Remove element by value
        vector.remove((Integer) 40);
        System.out.println("After removing 40: " + vector);

        // Get an element at a specific position
        System.out.println("Element at index 3: " + vector.get(3));

        // Get the size of the vector
        System.out.println("Vector size: " + vector.size());

        // Check if vector contains a specific element
        System.out.println("Does the vector contain 30? " + vector.contains(30));

        // Set a value at a specific index
        vector.set(0, 15);
        System.out.println("After setting element at index 0 to 15: " + vector);

        // Iterate through vector elements
        System.out.println("Elements in vector: ");
        for (int i = 0; i < vector.size();i++) {
            System.out.print(vector.get(i) + " ");
        }

        // Clear all elements in the vector
        vector.clear();
        System.out.println("\nAfter clearing the vector: " + vector);
    }
}
