public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            String str = args[i];
            if (isPalindrome(str)) {
                System.out.println(str);
            }
        }
    }
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
