// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        
        BigInteger sum  = a.add(b);
        BigInteger mul = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(mul);
        
    }
}
