//Write a java program which implements all the methods of Stack class


import java.util.Stack;

public class pr33 {
    public static void main(String args[]) {
        // Create a Stack object
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(1);
        stack.push(8);
        stack.push(6);
        stack.push(3);
        stack.push(21);
        stack.push(2);

        // Push method
        System.out.println("Push method: " + stack.push(99));  // Adds 99 to the stack

        // Peek method (gets the top element without removing it)
        System.out.println("Peek method: " + stack.peek());    // Shows the top element (99)

        // Pop method (removes and returns the top element)
        System.out.println("Pop method: " + stack.pop());      // Removes the top element (99)

        // Empty method (checks if the stack is empty)
        System.out.println("Empty method: " + stack.empty());  // False (stack is not empty)

        // Search method (returns the 1-based position of an element from the top of the stack)
        System.out.println("Search method: " + stack.search(21));  // 3 (position of 21 from the top)
    }
}
