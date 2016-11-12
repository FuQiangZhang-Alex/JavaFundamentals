package lesson03;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("", 0.0);
		
		Scanner input = new Scanner(System.in);
		account.setName(input.nextLine());
		System.out.println(account.getName());
		input.close();

	}

}
