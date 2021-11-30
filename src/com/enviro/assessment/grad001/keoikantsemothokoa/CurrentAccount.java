package com.enviro.assessment.grad001.keoikantsemothokoa;

import java.math.BigDecimal;

public class CurrentAccount extends SavingsAccount {
	//attributes
	BigDecimal overdraft;
	BigDecimal overdraftLimit = new BigDecimal(100000);
	
	//withdraw method
	public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
		
		balance = balance.add(overdraft);
		
		/* Checking if withdrawal amount is/is not larger than balance + overdraft
		 and updating account balance accordingly  
		*/
		if((balance.compareTo(amountToWithdraw) < 0)) {
			//Insufficient funds , transaction not possible!
			System.err.println("Insufficient funds, transaction not possible!");
		}
		else {
			balance = balance.subtract(amountToWithdraw);
			System.out.println("Account Number: " + accountNum + "\n" + "Remaining balance + overdraft: R" + balance);
		}
	}
}
