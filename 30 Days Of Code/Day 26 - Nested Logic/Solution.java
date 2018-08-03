// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int da = scan.nextInt();
        int ma = scan.nextInt();
        int ya = scan.nextInt();
        int de = scan.nextInt();
        int me = scan.nextInt();
        int ye = scan.nextInt();
        
        if ( ya < ye){
            System.out.println(0);
        }
        else if( ya > ye){
            System.out.println(10000);
        }
        else if ( ma < me ){
            System.out.println(0);
        }
        else if ( ma > me){
            System.out.println(500*(ma-me));
        }
        else if ( da > de){
            System.out.println(15*(da-de));
        }
        else{
            System.out.println(0);
        }
            
    }
}
