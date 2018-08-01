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
            long n = in.nextInt();
            
            long d1 = (n-1)/3, d2 = (n-1)/5, d3 = (n-1)/15;
            long sum = (3*(d1)*(d1+1)+ 5*(d2)*(d2+1)- 15*(d3)*(d3+1))/2;
            
            System.out.println(sum);
        }
        
    }
}
