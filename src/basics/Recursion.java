package basics;

public class Recursion {
    public static void main(String[] args) {
        String input = "ABCDCBA";
        System.out.println(isPalindrome(input,0, input.length()-1));
    }

    public static void printNameNTimes(int n) {
        recursivePrint(1, n);
    }

    private static void recursivePrint(int i, int n) {
        if (i > n)
            return;
        System.out.println("Gulshan");
        recursivePrint(i + 1, n);
    }

    public static void print1ToN(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1ToN(i + 1, n);
    }

    public static int sumOfFirstNNumbers(int n, int sum) {
        if (n <= 0) {
            return sum;
        }

        return sumOfFirstNNumbers(n - 1, sum + n);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static boolean isPalindrome(String string, int p1, int p2){
        if (string.charAt(p1)!=string.charAt(p2))
            return false;
        if (p1==p2)
            return true;
        return isPalindrome(string,p1+1,p2-1);
    }

    public static String fib(int n, int curr, StringBuilder stringBuilder){
        if (curr==n)
            return stringBuilder.toString();
//        fib(stringBuilder.append(curr+curr+1)
        return "";
    }
}
