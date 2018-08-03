// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;

public class Solution {

    static boolean isPrime(long n){
        if ( n < 2)
            return false;
        long m = (long)Math.sqrt(n);
        for ( long i = 2; i <= m; i++){
            if ( n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for ( int i = 1; i <= T; i++){
            scan.nextLine();
            long n = scan.nextLong();
            
            if ( isPrime(n) == true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
            
        }
    }
}
