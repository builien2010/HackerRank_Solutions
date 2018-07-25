// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    Difference( int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        maximumDifference = 0;
        for ( int i = 0; i < elements.length- 1; i++){
            for (int j = i + 1; j < elements.length; j++) {
                int temp = Math.abs(elements[i] - elements[j]);
                if( temp > maximumDifference){
                    maximumDifference = temp;
                }
            }
        }  
    }
    
 } 

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
