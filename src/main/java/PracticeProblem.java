/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Raymond Shen
	* Date Created: Feb 23, 2023
	* Date Last Modified: Feb 23, 2026
	*/


import java.util.Scanner;

public class PracticeProblem {
	

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);

		}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		String var2 = input.nextLine();
		System.out.print("Input another lowercase letter: ");
		String var3 = input.nextLine();

		int ascii2 = var2.charAt(0);
		int ascii3 = var3.charAt(0);
		System.out.println(ascii2 < ascii3);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		Double var3 = input.nextDouble();
		boolean var33 = (var3 > -1) && (var3 < 11);
		System.out.println (var33);


	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		Double var3 = input.nextDouble();
		System.out.println(var3 > 5);

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String var5 = input.nextLine();
		System.out.println((!var5.equals("banana")));
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		Integer var5 = input.nextInt();
		boolean bool6 = var5 % 2 == 0;
		System.out.println("The integer " + (var5) + " is " + bool6);

	}

}
