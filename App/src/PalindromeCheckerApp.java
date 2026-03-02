import java.util.Scanner;

class PalindromeService {

    public boolean check(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = service.check(input);

        System.out.println(result ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }
}