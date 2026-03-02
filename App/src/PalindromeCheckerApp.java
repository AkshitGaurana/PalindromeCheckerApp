import java.util.Scanner;

interface PalindromeStrategy {
    boolean check(String input);
}

class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeStrategy strategy = new ReverseStrategy();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = strategy.check(input);

        System.out.println(result ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }
}