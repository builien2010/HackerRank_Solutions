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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int temp = 0, count = 0, max = 0;
        
        while( n > 0){
            temp = n % 2;
            n = n/2;
            
            if ( temp == 1){
                count++;
                if ( count > max)
                    max = count;
            }
            else
                count = 0;
        }
        
        System.out.println(max);
        
        scanner.close();
    }
}
