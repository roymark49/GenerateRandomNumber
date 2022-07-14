package createRandomNumber;

import java.util.Scanner;
import java.util.TreeSet;

public class Generating_Random_Number {
public static void main(String[] args) {
		
		int upperBound = 1000;
		int lowerBound = 1;
	
		TreeSet<Integer> randomN = new TreeSet<Integer>();
		
		
			while(randomN.size()!=500){
				int randomInteger = (int) Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound);
				randomN.add(randomInteger);
			}
		System.out.println(randomN);
		System.out.println("Total size of numbers: " + randomN.size());
		
		System.out.println("My total number");
		Scanner ui = new Scanner(System.in);
		int userInput = ui.nextInt();
		Object[] arrayNumber = randomN.toArray();
		
		System.out.println(arrayNumber[userInput-1]);
	}
}
