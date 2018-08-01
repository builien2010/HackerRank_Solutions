// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            long largest, i;
            
            while ( n % 2 == 0){
                n /= 2;
            }
            
            if ( n == 1){
                largest = 2;
            }
            
            for (  i = 3; i <= Math.sqrt(n); i += 2){
                if ( n % i == 0){
                    n /= i;
                    i = i - 2;
                }
            }
            
            if ( n > 2){
                largest = n;
            }
            else
                largest = i - 2;
            
            System.out.println(largest);
            
        }
    }
}
