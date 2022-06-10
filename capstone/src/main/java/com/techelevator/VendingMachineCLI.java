package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachineCLI {


	public VendingMachineCLI() {
	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();


	}

	public void run() {

		Inventory sellableItems = new Inventory();
		sellableItems.setInventory();


		System.out.println("(1) Display Vending Machine Item\n(2) Purchase\n(3) Exit");

		Scanner userScanner = new Scanner(System.in);
		String userChoice = userScanner.nextLine();

		if (userChoice.equals("1")) {
			for (Item item : sellableItems.forSale) {
				System.out.printf("%s | %s | %s | items remaining: %s\n", item.getLocation(), item.getName(), item.getPrice(), item.getNumberOfItems());
			}
		} else if (userChoice.equals("2")){
			HandleMoney takeMoney = new HandleMoney();
			takeMoney.getBalance();
			System.out.printf("Current Money Provided: $%s\n", takeMoney.getBalance());
				while (true) {
					System.out.println("(1) Feed Money\n(2) Select Product\n(3) Finish Transaction");
					String userSelection = userScanner.nextLine();
					BigDecimal moneyFed = new BigDecimal(0);
					BigDecimal newBalance = new BigDecimal(0);
					if (userSelection.equals("1")) {
						System.out.println("Enter a whole dollar amount.");
						String userAmountEntered = userScanner.nextLine();
						BigDecimal bDUserAmountEntered = new BigDecimal(userAmountEntered);
						moneyFed = moneyFed.add(bDUserAmountEntered);
						newBalance = takeMoney.deposit(moneyFed);
						System.out.printf("Current Money Provided: %s\n", newBalance);
					} else if (userSelection.equals("2")) {
						for (Item item : sellableItems.forSale) {
							System.out.printf("%s | %s | %s | items remaining: %s\n", item.getLocation(), item.getName(), item.getPrice(), item.getNumberOfItems());
						}
						System.out.println("Please select item location. ex: A1 ");
						String itemChosen = userScanner.nextLine();
						for (Item item : sellableItems.forSale) {
							if (item.getLocation().equals(itemChosen)){
								newBalance = newBalance.subtract(item.getPrice());
								item.dispense(newBalance);
							}
						}
					} else if (userSelection.equals("3")){
						break;
					}
				}
			}

		}









//		if (userChoice.equals("1")){
//			MainMenu.displayInventoryList();
//		} else if (userChoice.equals("2")){
//			PurchaseMenu.returnToPurchaseMenu();
//			if (userChoice.equals("1")){
//				PurchaseMenu.feedMoney();
//			}
//		}
	}


