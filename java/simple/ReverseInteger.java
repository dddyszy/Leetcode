package simple;

/**
 * @author shizhy
 * @date 2020/8/6
 */
public class ReverseInteger {

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = result * 10 + t;
            if ((newRes - t) / 10 != result) {
                return 0;
            }
            result = newRes;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 321;
        System.out.println(reverse(x));
    }

}
