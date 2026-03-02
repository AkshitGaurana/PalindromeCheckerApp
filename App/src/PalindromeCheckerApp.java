import java.util.*;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.add(Character.toLowerCase(c));
        }
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Madam";
        System.out.println(isPalindrome(input));
    }
}