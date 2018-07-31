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
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int sumSwap = 0, swap = 0;
        
        for (int i = 0; i < n ; i++){
            swap = 0;
            for (int j = 0; j < n - 1; j++){
                if ( a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sumSwap++;
                    swap = 1;
                }
            }
            
            if ( swap == 0){
                break;
            }
            
        }
        
        System.out.println("Array is sorted in " + sumSwap + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);  
        
    }
}
