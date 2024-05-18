package basics;

import java.util.ArrayList;

public class MathQuestions {
    public static void main(String[] args) {
        System.out.println(divisors(153));
    }

    public static int countDigits(int n) {
        // Write your code here.
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static boolean checkPalindrome(int num) {
        // 121
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp /= 10;
        }
        return reverse == num;
    }

    public static int gcd(int a, int b) {
        int gcd = 1;
        int smallNum, bigNum;
        if (a > b) {
            smallNum = b;
            bigNum = a;
        } else {
            smallNum = a;
            bigNum = b;
        }
        if (((bigNum%smallNum)==0))
            return smallNum;
        for (int i = 1; i <= smallNum; i++) {
            try {
                if (smallNum % i == 0 && bigNum % i == 0) {
                    gcd = i;
                }
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return gcd;
    }


    static boolean armstrongNum(int num){
        int temp = num;
        int power = 0;
        while (temp>0){
            temp/=10;
            power++;
        }
        temp = num;
        int sum = 0;
        while (temp>0){
            int digit = temp%10;
            temp=temp/10;
            sum+= (int) Math.pow(digit,power);
        }
        return num==sum;
    }

    static ArrayList<Integer> divisors(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=num;i++){
            if (num%i==0)
                list.add(i);
        }
        return list;
    }
}
