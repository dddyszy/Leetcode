package simple;

/**
 * @author shizhy
 * @date 2020/8/8
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        int right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = getValue(s.charAt(i));
            if (value >= right) {
                result += value;
            } else {
                result -= value;
            }
            right = value;
        }
        return result;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }


}
