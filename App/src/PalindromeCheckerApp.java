import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println(input.equals(reversed) ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }
}