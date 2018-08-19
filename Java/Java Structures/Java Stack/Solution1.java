// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.util.*;
class Solution{
    
    static boolean match(char a, char b){
            if( a == '{' && b == '}')
                return true;
            if( a == '(' && b == ')')
                return true;
            if( a == '[' && b == ']')
                return true;
            
            return false;
    }     
    
    static boolean solve(String input){
    
        Stack<Character> stack = new Stack<>();
        char[] s = input.toCharArray();
            
        for ( int i =  0; i < s.length; i++){  
            if( s[i] == '{' || s[i] == '(' || s[i] == '['){
                stack.push(s[i]);
            }else if(stack.empty()){
                return false;
            }else{
                char c = stack.pop();
                if(!match(c, s[i])){
                    return false;
                }
            }
        }
            
        return stack.empty();
        
    }
	
    public static void main(String []argh){ 
        
	Scanner sc = new Scanner(System.in);
		
	while (sc.hasNext()) {
            
		String input=sc.next();
            
    		if(solve(input)){
        		System.out.println("true");
    		}else{
       			System.out.println("false");
    		}       
   	}
		
    }
}
