public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        return check(input, 0, input.length() - 1);
    }

    private static boolean check(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return check(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "radar";
        System.out.println(isPalindrome(input));
    }
}