
import java.util.Scanner;

public class digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            reversed = reversed * 10 + digit;
            sum += digit;

            n = n / 10;
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
        System.out.println("Sum of Digits: " + sum);

        if (original == reversed) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        sc.close();
    }
}

