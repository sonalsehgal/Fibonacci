package day6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of terms: ");
		int a=0, b=1;
		int num = scanner.nextInt();
		
		System.out.println("Fibonacci Sequence: ");
		
		for (int i=1; i<=num; i++)
		{
			System.out.println(a+ " ");
			int next = a+b;
			a=b;
			b=next;
		}

	}

}
