
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Januarytenth";
		String dadsBirthday = "MarchSixteenth";
	    String myBirthday = "OctoberFifteenth";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog(null, "Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(Birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(Birthday.equals("mom")) {
			System.out.println("JanuaryTenth");
		}
		// 5. if user asked for "dad"
		if(Birthday.equals("dad")) {
			System.out.println("MarchSixteenth");
		}
		// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		if(Birthday.equals("me")) {
	System.out.println("OctoberFifteenth");
	}
	
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
	} 
}
