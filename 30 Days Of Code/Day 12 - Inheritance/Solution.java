// Author: Lien Bui 
// GitHub: github.com/builien2010
// HackerRank: hackerrank.com/builien2010

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    
    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    public void printPerson(){
        super.printPerson();
    }

    public char calculate(){
        int sum = 0;
        for ( int i = 0; i < testScores.length; i++)
            sum += testScores[i];
        
        double tb= 1.0*sum/(testScores.length);
        /*
        if ( tb < 40 )
            return 'T';
        else if ( tb < 55)
            return 'D';
        else if ( tb < 70)
            return 'P';
        else if ( tb < 80)
            return 'A';
        else if (tb < 90)
            return 'E';
        else 
            return 'O';
         */
        
        return (tb < 40) ? 'T' : (tb < 55) ? 'D' : (tb < 70) ? 'P' : (tb < 80) ? 'A' : (tb < 90) ? 'E' : 'O';
    }  
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}


