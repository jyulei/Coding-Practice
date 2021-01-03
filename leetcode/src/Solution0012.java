import java.util.Scanner;

/**
 * 12. 整数转罗马数字
 */
public class Solution0012 {
    public static String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        while (num != 0) {
            if (num >= 1000) {
                s.append("M");
                num = num -1000;
            } else if (num >= 500 && num < 1000) {
                if (num >= 900) {
                    s.append("C");
                    s.append("M");
                    num -= 900;
                } else {
                    s.append("D");
                    num -= 500;
                }
            } else if (num >= 100 && num < 500) {
                if (num >= 400) {
                    s.append("C");
                    s.append("D");
                    num -= 400;
                } else {
                    s.append("C");
                    num -= 100;
                }
            } else if (num >= 50 && num < 100) {
                if (num >= 90) {
                    s.append("X");
                    s.append("C");
                    num -= 90;
                } else {
                    s.append("L");
                    num -= 50;
                }
            } else if (num >= 10 && num < 50) {
                if (num >= 40) {
                    s.append("X");
                    s.append("L");
                    num -= 40;
                } else {
                    s.append("X");
                    num -= 10;
                }
            } else if (num >= 5 && num < 10) {
                if (num >= 9) {
                    s.append("I");
                    s.append("X");
                    num -= 9;
                } else {
                    s.append("V");
                    num -= 5;
                }
            } else {
                if (num >= 4) {
                    s.append("I");
                    s.append("V");
                    num -= 4;
                } else {
                    s.append("I");
                    num -= 1;
                }
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            System.out.println(intToRoman(n));
        }

    }
}
