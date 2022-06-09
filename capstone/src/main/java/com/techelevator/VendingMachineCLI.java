package com.techelevator;

import java.util.Scanner;

public class VendingMachineCLI {

	public VendingMachineCLI() {
	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();

	}

	public void run() {
		System.out.println("(1) Display Vending Machine Items\n(2) Purchase\n(3) Exit");

		Scanner userScanner = new Scanner(System.in);
		String userChoice = userScanner.nextLine();

		if (userChoice.equals("1")){
			MainMenu.displayInventoryList();
		} else if (userChoice.equals("2")){
			PurchaseMenu.returnToPurchaseMenu();
			if (userChoice.equals("1")){
				PurchaseMenu.feedMoney();
			}
		}
	}

}
