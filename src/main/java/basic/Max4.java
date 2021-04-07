package basic;

import java.util.Scanner;

/**
 * 4개의 숫자중 가장 큰 수를 구함
 */
public class Max4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        System.out.println("max : " + max);
    }
}
