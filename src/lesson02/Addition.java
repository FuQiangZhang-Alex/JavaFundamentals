package lesson02;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int sum;
		System.out.print("a: ");
		a = input.nextInt();
		System.out.print("b: ");
		b = input.nextInt();
		input.close();
		sum = a + b;
		System.out.println(sum);
	}

}
