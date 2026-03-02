class PalindromeService {
    public boolean isPalindrome(String input) {
        input = input.toLowerCase();
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
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();
        String input = "noon";
        System.out.println(service.isPalindrome(input));
    }
}