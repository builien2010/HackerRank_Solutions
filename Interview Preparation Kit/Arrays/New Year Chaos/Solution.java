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

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        
        int swaps = 0;
        
        for ( int i = 0; i < q.length; i++){
            if(q[i] - (i + 1) > 2){
                System.out.println("Too chaotic");
                return;
            }
    
            // đếm các số lớn hơn nó phía trước 
            // q[i] - 1 ( do mảng bắt đầu từ 0): chỉ mục gốc và  hối lộ 1 bước nên - 1
            for ( int j = Math.max(0, q[i] - 2); j < i; j++){
                if(q[j] > q[i])
                    swaps++;
            }
            
        }
        
        System.out.println(swaps);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
