package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//while loop is working like if condition 
		//and also in while loop inside the while loop we should make a false situation
		Scanner word = new Scanner(System.in); 
		
		System.out.println("Give me a word");
		
		
		String a = word.next();
		
		while(!a.contains("e")) {
			System.out.println(word);
			
			System.out.println("Give me a word");
		
			a = word.next();
		}
		
		System.out.println("wow");
			

	}

}
