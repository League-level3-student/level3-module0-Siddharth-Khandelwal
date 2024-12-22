package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	

        // 2. create an array of 5 robots.
Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setSpeed(4);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(150 * i + 150);
			robots[i].setY(500);
		}
		int num = -1;
		// 5. use another for loop to iterate through the array and make each robot move
			int j = 500;
			while (j >= 100) {

				// a random amount less than 50.
				for (int i1 = 0; i1 < robots.length; i1++) {
					
					Random rand = new Random();
					int bob = rand.nextInt(50);
					robots[i1].move(bob);
					j = robots[i1].getY();
					if (j < 100) {
						num = i1;
						break;
					}
				}
			}


    	
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    System.out.println("Here's a party for Robot "+num+"!");
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
}
