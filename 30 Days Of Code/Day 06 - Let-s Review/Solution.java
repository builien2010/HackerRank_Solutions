// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        
        for ( int i = 1; i <= n; i++){
            
            String s = scan.nextLine();
            for ( int j = 0; j < s.length(); j = j + 2){
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for ( int j = 1; j < s.length(); j = j + 2){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        
    }
}
