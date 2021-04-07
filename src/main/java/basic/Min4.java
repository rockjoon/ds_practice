package basic;

import java.util.Scanner;

/**
 * 4 개의 숫자 중 가장 작은 수를 구함.
 */
public class Min4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        System.out.println("min : " + min);
    }
}
