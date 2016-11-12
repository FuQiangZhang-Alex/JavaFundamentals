package lesson02;

import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		a = input.nextInt();
		b = input.nextInt();
		input.close();
		
		if ( a == b ){
			System.out.printf("%d == %d%n", a, b);
		} else if ( a > b ) {
			System.out.printf("%d > %d%n", a, b);
		} else {
			System.out.printf("%d < %d%n", a, b);
		}
	}

}
