/**
 * 
 */

/**
 * @author d.fyvie
 *
 */
import java.util.Scanner;
public class StudentInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);


		String firstNam;
		String lastNam;
		int grade;
		int studID;
		String login;
	    int average;
	
		
		System.out.println("Hello, Please enter the following information");
		
		System.out.println("What is your first name?");
		firstNam=userInput.next();
		
		System.out.println("What is your last name?");
		lastNam=userInput.next();
		
		System.out.println("What grade are you in?");
		grade=userInput.nextInt();
		
		System.out.println("What is your student ID?");
		studID=userInput.nextInt();
		
		System.out.println("What is your login?");
		login=userInput.next();
		
		System.out.println("Whats your Average?");
		average=userInput.nextInt();
			
		
		
		System.out.println(String.format("%10s %10s","Login: ", login ));
		
		System.out.println(String.format("%10s %10d","ID: ", studID));
		
		System.out.println(String.format ("%10s %10s","Name: ", lastNam +","+ firstNam));
		
		System.out.println(String.format ("%10s %10s","Average: ", average));
		
		System.out.println(String.format ("%10s %10d", "Grade: ", grade));
		
	
		
		
		
		
		userInput.close();	
	}

}
