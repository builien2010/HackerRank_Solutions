// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for ( int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        
        int countNegativeSum = 0;
        int sum;
        
        for ( int i = 0;i < a.length; i++){
            sum = 0;
            for ( int j = i; j < a.length; j++){
                sum = sum + a[j];
                if( sum < 0){
                    countNegativeSum++;
                }  
            }
        }
        
        System.out.println(countNegativeSum);
        
    }
}
