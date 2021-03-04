package com.hieulexuan.practices;

import java.util.Scanner;

public class MultipleChoiceQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Lenh countine in java is?");
			System.out.println("1. continue");
			System.out.println("2. break");
			System.out.println("Enter q then exit");
			String choise = scanner.nextLine();
			
			if (choise.equals("1")) {
				System.out.println("You success");
				break;
			} else if (choise.equals("2")) {
				System.out.println("You fail");
				break;
			} else if (choise.equals("q" )) {
				break;
			} else {
				System.out.println("Please choise your answer");
			}
		}
		
	}

}
