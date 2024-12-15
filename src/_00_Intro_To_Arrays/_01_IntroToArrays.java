package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] strings = new String[5];
strings[0] = "Joe";
strings[1] = "Bobert";
strings[2] = "Joe";
strings[3] = "Mike";
strings[4] = "Stefanos";
        // 2. print the third element in the array
System.out.println(strings[2]);
        // 3. set the third element to a different value
strings[2] =  "Carlos";
        // 4. print the third element again
System.out.println(strings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < strings.length; i++) {
	strings[i] = "Casper";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < strings.length; i++) {
	System.out.println(strings[i]);
}
        // 7. make an array of 50 integers
int[] ints = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number

Random rand = new Random();
for (int i = 0; i < ints.length; i++) {
	ints[i] = rand.nextInt(43093);
			
}
int y = 43093;
        // 9. without printing the entire array, print only the smallest number
        //    on the array
for (int i = 0; i < ints.length; i++) {
	int x = ints[i];
	
	if (x<y) {
		y=x;
	}
}
System.out.println("Smallest: "+y);
        // 10 print the entire array to see if step 8 was correct
for (int i = 0; i < ints.length; i++) {
	System.out.println(ints[i]);
}

        // 11. print the largest number in the array.
int c = 0;
// 9. without printing the entire array, print only the smallest number
//    on the array
for (int i = 0; i < ints.length; i++) {
int p = ints[i];

if (p>c) {
c=p;
}
}
System.out.println("Largest: "+c);
        // 12. print only the last element in the array
System.out.println("Last: "+ints[49]);
    }
}
