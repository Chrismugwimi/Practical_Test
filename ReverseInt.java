/*1. Design a function that reverses the digits of an integer. For example, 50
should become 5 and -12 should become -21.*/
import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int remainder = 0;
        int reversedInt = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
    
        boolean isNegativeInt = number < 0;
        int absNumber = Math.abs(number);
        
        while (absNumber > 0) {
            remainder = absNumber % 10;
            absNumber = absNumber / 10;
            reversedInt = (reversedInt * 10) + remainder;
        }

        if (isNegativeInt) {
            reversedInt = -reversedInt;
        }
        
        System.out.printf("The reversed integer is %d", reversedInt);
    }
}

