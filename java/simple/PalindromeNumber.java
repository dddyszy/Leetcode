package simple;

/**
 * @author shizhy
 * @date 2020/8/6
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int result = 0;
        int o = x;
        while (x != 0) {
            int t = x % 10;
            int newRes = result * 10 + t;
            if ((newRes - t) / 10 != result) {
                return false;
            }
            result = newRes;
            x /= 10;
        }
        return result == o;
    }

    public static boolean isPalindrome2(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome2(x));
    }

}
