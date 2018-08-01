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
        
            long a = 0, b = 2, c = 2;
            long sum = 2;
            
            while( c < n){
                c = 4*b + a;
                
                if(c >= n)
                    break;
                else{
                    sum += c;
                    a = b;
                    b = c;
                }
                
            }
            
            System.out.println(sum);
                   
        }
    }
}
