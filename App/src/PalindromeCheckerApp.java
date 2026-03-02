public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        System.out.println(isPalindrome(input));
    }
}