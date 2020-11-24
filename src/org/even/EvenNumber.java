package org.even;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Even number:");
		int i=s1.nextInt();
		if (i%2==0) {
			System.out.println("The entered number is even number:"+i);
			
		} else {
			System.out.println("The entered number is not even number:"+i);

		}

}
	public void testmethod() {
		System.out.println("Test Method");

	}
}
		
		
		
	
	


