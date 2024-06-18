/*5. Design a function that takes a list of integers as input. The function should
return True if the list contains two consecutive threes (3 next to a 3) anywhere
within the list. Otherwise, it should return False. For example, the function
should return True for [1, 3, 3] and False for [1, 3, 1, 3].*/
import java.util.Scanner;

public class Consecutive3s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of integer:");
        String input = scanner.nextLine().trim();
        scanner.close();
        
        boolean result = containsConsecutive3s(input);
        
        System.out.println(result);
    }
    
    public static boolean containsConsecutive3s(String input) {

        char prevChar = '\0';
        
        for (char currentChar : input.toCharArray()) {
      
            if (currentChar == '3' && prevChar == '3') {
                return true;
            }
            
            prevChar = currentChar;
        }
        
        return false;
    }
}
