//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import java.awt.Component;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like bannanas?");
		//2. if they say no, 
			if(answer.equals("no") ) {
				JOptionPane.showMessageDialog(null, "You are crazy. I feel bad for you and your family!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.exit(0);
			}
		//tell them they are crazy 
			//and end quiz
		//3. if they say yes
			if(answer.equals("yes")) {
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + "is better with banannas!");
			}

//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something othbananaser than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are !â€�
	
	}

}
