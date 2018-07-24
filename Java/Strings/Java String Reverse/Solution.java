// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        StringBuilder B = new StringBuilder(A);
        
        if(B.reverse().toString().compareTo(A) == 0)
            System.out.println("Yes");
        else 
            System.out.println("No");
        
        
        
        
    }
}



