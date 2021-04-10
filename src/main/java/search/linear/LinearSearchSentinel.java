package search.linear;

import java.util.Scanner;

public class LinearSearchSentinel {

    static int linearSearchSentinel(int[] arr, int target) {
        int size = arr.length;
        return 0;



    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("total element count : ");
        int n = stdIn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = stdIn.nextInt();
        }

        System.out.print("what do you want to search ? : ");
        int rslt = linearSearchSentinel(arr, stdIn.nextInt());
        System.out.printf("result : %d", rslt);
    }

}
