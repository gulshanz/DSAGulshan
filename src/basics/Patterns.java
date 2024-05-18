package basics;

import java.util.*;


public class Patterns {

    public static void main(String[] args) {
        decreasingLetter(5);
    }

    public static void halfDiamond(int n) {
        // increasing pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void binaryNumberTriangle(int n) {
        int firstVal = 1;
        for (int i = 0; i < n; i++) {
            int fistRowItem = firstVal;
            int nextItemValue = fistRowItem;
            for (int j = 0; j <= i; j++) {
                System.out.print(nextItemValue);
                nextItemValue = toggleValue(nextItemValue);
            }
            firstVal = toggleValue(fistRowItem);
            System.out.println();
        }
    }

    public static int toggleValue(int value) {
        if (value == 0)
            return 1;
        return 0;
    }

    public static void numberCrown(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else
                    System.out.print(" ");
            }
            for (int j = n; j >= 1; j--) {
                if (j <= i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void increasingNumber(int n){
        int currNum = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(currNum++ +" ");
            }
            System.out.println();
        }
    }

    public static void increasingLetter(int n){
        for (int i=1;i<=n;i++){
            for (char j='A';j<='A'+i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void decreasingLetter(int n){
        for (int i=0;i<n;i++){
            for (char j='A';j<='A'+(n-i)-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
