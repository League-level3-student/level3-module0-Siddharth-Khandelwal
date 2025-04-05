/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import static org.junit.Assert.assertArrayEquals;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		int cowsGoingRight = 0;
		int cowsGoingDown = 0;
		int cowsGoingLeft = 0;
		int cowsGoingUp = 0;
		int[] recentRight = { 0, 0 };
		int[] recentDown = { 0, 0 };
		int[] recentLeft = { 0, 0 };
		int[] recentUp = { 0, 0 };

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {

				if (field[i][j] == 'c') {
					if (j < field[i].length - 2 && field[i][j + 1] == 'o' && field[i][j + 2] == 'w') {
						cowsGoingRight++;
						recentRight[0] = j;
						recentRight[1] = i;
					}
				}
				if (field[i][j] == 'c') {
					if (i < field.length - 2 && field[i + 1][j] == 'o' && field[i + 2][j] == 'w') {
						cowsGoingDown++;
						recentDown[0] = j;
						recentDown[1] = i;
					}
				}
				if (field[i][j] == 'c') {
					if (j > 1 && field[i][j - 1] == 'o' && field[i][j - 2] == 'w') {
						cowsGoingLeft++;
						recentLeft[0] = j;
						recentLeft[1] = i;
					}
				}
				if (field[i][j] == 'c') {
					if (i > 1 && field[i - 1][j] == 'o' && field[i - 2][j] == 'w') {
						cowsGoingUp++;
						recentUp[0] = j;
						recentUp[1] = i;
					}
				}

			}

		}
		if (cowsGoingRight == 1) {
			return recentRight;
		} else if (cowsGoingDown == 1) {
			return recentDown;
		} else if (cowsGoingLeft == 1) {
			return recentLeft;
		} else {
			return recentUp;
		}

	}
}
