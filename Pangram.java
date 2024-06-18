/*4. Design a function that determines whether a given string is a pangram. A
pangram is a sentence or phrase containing every letter of the alphabet at
least once. Punctuation and case are typically ignored. For example, the
string "The quick brown fox jumps over the lazy dog" is a pangram, while
"Hello, world!" is not.*/
import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a pangram: ");
        String input = scanner.nextLine();
        scanner.close();

        checkPangram(input);
    }

    public static void checkPangram(String input) {
        HashSet<Character> letters = new HashSet<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        if (letters.size() == 26) {
            System.out.println("It is a pangram");
        } else {
            System.out.println("It is not a pangram");
        }
    }
}
