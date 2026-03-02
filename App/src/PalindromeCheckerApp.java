public class PalindromeCheckerApp {

    static boolean method1(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    static boolean method2(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String test = "madam";

        long start1 = System.nanoTime();
        method1(test);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        method2(test);
        long end2 = System.nanoTime();

        System.out.println("StringBuilder Time: " + (end1 - start1));
        System.out.println("Two-Pointer Time: " + (end2 - start2));
    }
}