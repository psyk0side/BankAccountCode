package bankAccount;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bankInfo = new Scanner(System.in);
		double withDrawal, dePosit;
		double baLance = 200000;
		int userSelect;
		
		System.out.println("Hello there! If you would like to access and do transactions or check your history, please enter the number you would like to go to.");		
		System.out.println("1. Deposit Money "
				+ "2. Withdraw Money "
				+ "3. Check Your Balance "
				+ "4. Check Transactiion History ");
		
		userSelect = bankInfo.nextInt();
		
		if (userSelect == 1) {
			System.out.println("You are about to deposit money, please enter the amount that you would like to deposit.");
			dePosit = bankInfo.nextDouble();
			baLance = baLance + dePosit;
			System.out.println("Your current balance is: " + "$" + baLance);
		} else if (userSelect == 2) {
			System.out.println("You are about to withdraw money, please enter the amount that you would like to withdraw");
			withDrawal = bankInfo.nextDouble();
			baLance = baLance + withDrawal;
			System.out.println("Your current balance is: " + "$" + baLance);
		} else if (userSelect == 3) {
			System.out.println("Your current balance right now is: " + "$" + baLance);
		} else if (userSelect == 4) {
			
		} else {
			System.out.println("Please enter a valid number.");
		}
		
		System.out.println("Would you like to make another transaction?");
		
		bankInfo.close();
	}
}
