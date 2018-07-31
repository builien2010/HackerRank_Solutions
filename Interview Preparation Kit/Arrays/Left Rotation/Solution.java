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

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        /* C1
        int n = a.length;
        for ( int i = 1; i <= d; i++){
            int temp = a[0];
            for ( int j = 0 ; j < n - 1; j++){
                a[j] = a[j+1];
            }
            a[n-1] = temp;
            
        }
        return a;
        */
        
        // C2: use a new array
        int n = a.length;
        int[] rotated = new int[n];
        
        System.arraycopy(a, d, rotated, 0, n-d);
        System.arraycopy(a, 0, rotated, n -d, d);
        
        return rotated;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
/* Note:
    https://www.tutorialspoint.com/java/lang/system_arraycopy.htm
    System.arraycopy(Object src, int srcPos, Object dest, int desPos, int length);
    src: This is the source array
    srcPos: This is the start position in the source array
    dest: This is the destination array
    desPos: This is the start position in the destination array
    length: This is the length destination array
*/
