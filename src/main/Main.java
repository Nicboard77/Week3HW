package main;

public class Main {

	public static void main(String[] args) {
		// creation of the new array
		int[] ages = new int[9];
		// assigning the values into the array
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 45;
		//a loop for printing out each value of the array
		for(int i = 0; i < ages.length; i++){
			System.out.println(ages[i]);
		}
		double[] array1 = new double[3];
		array1[0] = 15;
		array1[1] = 35;
		array1[2] = 40;
		double[] array2 = new double[3];
		array2[0] = 3;
		array2[1] = 6;
		array2[2] = 9;
		//This line of code programmatically subtracts the first value in the array from the last value
		System.out.println(ages[ages.length-1]-ages[ages.length-ages.length]);
		//After adding the 9th integer to the array, it still worked.
		int counter = 0;
		//The above line is creating a variable for use in the loop, as an additive holder of integers
		//If it was in the loop, it would be reset to 0 each iteration
		//Loop for adding each number in the array together
		for(int i = 0; i < ages.length;i++) {
			counter = counter + ages[i];
		}
		//Line of code for printing the rough average of the array
		System.out.println("the average age is " + counter/ages.length);
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		double nameLength = 0;
		for(String name : names) {
			nameLength += name.length();
	}
		System.out.println("The average number of letters per name is " + nameLength/names.length);
		String result = "";
		for(int i = 0; i < names.length; i++) {
			result += names[i] + " ";
		}
		System.out.println(result);
		
		int[] nameLengths = new int[6];
		for(int i = 0; i<names.length; i++) {
			System.out.println(nameLengths[i] = names[i].length());
		
		}
		//this block of code runs all the methods and prints the,
		System.out.println(concatinator("Hello",3));
		System.out.println(fullNameMaker("Mike", "Smith"));
		System.out.println(sumOfInts(ages));
		System.out.println(averageOfArray(array1));
		System.out.println(arrayIsGreater(array1,array2));
		System.out.println(willBuyDrink(true, 10.49));
	}
	//This method takes a word and an integer and concatenates the word onto itself for n amount of times
	public static String concatinator(String word, int n) {
		int i = 0;
		String placeholder = "";
		while(i++ <=n) {
			placeholder += word;
		
		}
		return placeholder;
	}
	//This simple method takes two strings ( first and last name ), and combines them into a full name
	public static String fullNameMaker(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//This method takes an array of integers ( in this case, the ages array we used earlier
	//and it takes the sum of all the values in the array, and returns true if its > 100, false if not
	public static boolean sumOfInts(int[] array) {
		int i = 0;
		for(int numbers : array) {
			i += numbers;
		}
		if (i >= 100) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean arrayIsGreater(double[] array1, double[] array2) {
		double average1= averageOfArray(array1);
		double average2 = averageOfArray(array2);
		if(average1 > average2) {
			return true;
		} else {
			return false;
		}
	}
	public static double averageOfArray(double[] array) {
		int placeholder = 0;
		for(int i = 0; i <= array.length-1;) {
			placeholder += array[i];
			i++;
		}
		return placeholder / array.length;}	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
}
	

