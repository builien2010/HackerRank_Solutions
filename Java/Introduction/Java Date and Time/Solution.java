// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.util.Scanner;
import java.time.LocalDate;

public class Calendar{
    public static String getDay(String day, String month, String year){
        int dd = Integer.parseInt(day);
        int mm = Integer.parseInt(month);
        int yy = Integer.parseInt(year);

        LocalDate dt = LocalDate.of(yy, mm, dd);
        
        return dt.getDayOfWeek().toString();
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
