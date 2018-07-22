// Code by Lien Bui

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map <String, Integer> newmap = new HashMap<String, Integer>();
        
        for ( int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            newmap.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            
            if(newmap.containsKey(s)){
                System.out.println(s+"="+newmap.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        
        in.close();
    }
}
