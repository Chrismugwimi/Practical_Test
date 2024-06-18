/*3. Design a function that takes a string or sequence of characters as input and
returns the character that appears most frequently.
//Eg 11189 => '1'
//hello => l*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or numbers: ");
        String input = scanner.nextLine();
        scanner.close();

        char FreqChar = findFreqChar(input);
        System.out.printf("The most frequent character is '%c'%n", FreqChar);
    }

    public static char findFreqChar(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char FreqChar = input.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                FreqChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return FreqChar;
    }
}
