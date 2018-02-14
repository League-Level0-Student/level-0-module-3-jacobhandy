
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {

		//3. ask the user what color they would like the robot to draw
		int color = JOptionPane.showOptionDialog(null, "What color do you want me to draw?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "red", "blue", "green", "random" }, null);
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)

		
		Robot rob = new Robot();


if(color == 0) {
	rob.setPenColor(225,0,0);
}
if(color == 1) {
	rob.setPenColor(0,0,225);
}
if(color == 2) {
	rob.setPenColor(0,225,0);
}
else {
rob.setRandomPenColor();
}
rob.setSpeed(25);
rob.penDown();
rob.setPenWidth(10);
for(int i = 0; i<8; i++) {
rob.move(100);
rob.turn(45);

}

	
	}
}
	

