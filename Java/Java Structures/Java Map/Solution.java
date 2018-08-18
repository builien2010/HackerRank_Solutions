// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        
        Map<String,Integer> newMap = new HashMap<>();
        
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            newMap.put(name, phone);
		}
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            
            if(newMap.containsKey(s)){
                System.out.println(s + "=" +newMap.get(s));
            }else{
                System.out.println("Not found");
            }
		}
    
	}
}

