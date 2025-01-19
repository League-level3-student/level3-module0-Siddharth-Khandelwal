package _01_Simple_Array_Algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		prints();

		reversePrints();

		printsEveryOther();

		printsRandom();
	}

	static // 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void prints() {
		String[] array = new String[5];
		String one = JOptionPane.showInputDialog("Type a name!");
		String two = JOptionPane.showInputDialog("Type a name!");
		String three = JOptionPane.showInputDialog("Type a name!");
		String four = JOptionPane.showInputDialog("Type a name!");
		String five = JOptionPane.showInputDialog("Type a name!");
		array[0] = one;
		array[1] = two;
		array[2] = three;
		array[3] = four;
		array[4] = five;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static // 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void reversePrints() {
		String[] array = new String[5];
		String one = JOptionPane.showInputDialog("Type a name!");
		String two = JOptionPane.showInputDialog("Type a name!");
		String three = JOptionPane.showInputDialog("Type a name!");
		String four = JOptionPane.showInputDialog("Type a name!");
		String five = JOptionPane.showInputDialog("Type a name!");
		array[0] = five;
		array[1] = four;
		array[2] = three;
		array[3] = two;
		array[4] = one;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void printsEveryOther() {
		String[] array = new String[5];
		String one = JOptionPane.showInputDialog("Type a name!");
		String two = JOptionPane.showInputDialog("Type a name!");
		String three = JOptionPane.showInputDialog("Type a name!");
		String four = JOptionPane.showInputDialog("Type a name!");
		String five = JOptionPane.showInputDialog("Type a name!");
		array[0] = one;
		array[1] = two;
		array[2] = three;
		array[3] = four;
		array[4] = five;
		for (int i = 0; i < array.length; i += 2) {
			System.out.println(array[i]);
		}
	}

	static // 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void printsRandom() {
		String[] array = new String[5];
		String one = JOptionPane.showInputDialog("Type a name!");
		String two = JOptionPane.showInputDialog("Type a name!");
		String three = JOptionPane.showInputDialog("Type a name!");
		String four = JOptionPane.showInputDialog("Type a name!");
		String five = JOptionPane.showInputDialog("Type a name!");
		array[0] = one;
		array[1] = two;
		array[2] = three;
		array[3] = four;
		array[4] = five;

		for (int i = 0; i < array.length; i++) {
			Random rand = new Random();
			int r = rand.nextInt(5);
			System.out.println(array[r]);
		}
	}

}
