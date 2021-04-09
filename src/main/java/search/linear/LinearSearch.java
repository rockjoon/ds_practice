package search.linear;

import java.util.Scanner;

/**
 * 일반적인 선형 검색
 */
public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        int size = arr.length;

//        while로 구현
//        int i = 0;
//        while (true) {
//            if (i == size)
//                return -1;
//            if (arr[i] == target)
//                return i;
//            i++;
//        }

//        for문으로 구현
        for (int i = 0; i < size; i++)
            if (arr[i] == target)
                return i;
        return -1;
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
        int rslt = linearSearch(arr, stdIn.nextInt());
        System.out.printf("result : %d", rslt);
    }
}
