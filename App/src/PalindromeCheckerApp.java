import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] characters = input.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < characters.length / 2; i++) {
            if (characters[i] != characters[characters.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}