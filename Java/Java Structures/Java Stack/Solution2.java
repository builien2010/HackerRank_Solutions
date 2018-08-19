/ Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.util.*;
class Solution{
	
	public static void main(String []argh){ 
        
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            
		String input=sc.next();
            
      		while(input.length() != (input =  input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
     		System.out.println(input.isEmpty());
   	  	}
		
	}
}
