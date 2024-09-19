// Write a java program which will reverse the string



import java.util.Arrays;
import java.util.Scanner;

public class pr35{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	//Taken String as an input through nextLine()
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert string to character array, sort, and reverse
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        
        // Reverse sorted array
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}



