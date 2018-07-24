// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zero = 0;
        int n = arr.length;
        for ( int i = 0; i < n; i++)
        {
            if ( arr[i] > 0)
                positiveNumber++;
            else if ( arr[i] < 0)
                negativeNumber++;
            else
                zero++;
        }
        
        System.out.println(1.0*positiveNumber/n);
        System.out.println(1.0*negativeNumber/n);
        System.out.println(1.0*zero/n);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
