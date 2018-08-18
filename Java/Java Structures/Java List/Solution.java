// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for ( int i = 0; i < N; i++){
            list.add(scan.nextInt());
        }
        
        int Q = scan.nextInt();
        
        for ( int i = 0; i < Q; i++){
            String s = scan.next();
            if(s.equals("Insert")){
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            }else{
                int index = scan.nextInt();
                list.remove(index);       
            }
        }
        
        scan.close();
        
        for ( int element: list){
            System.out.print(element + " ");

        }
        
    }
}
