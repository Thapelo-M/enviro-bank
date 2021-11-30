package com.enviro.assessment.grad001.keoikantsemothokoa;
import java.math.BigDecimal;

public class SavingsAccount {
	//Attributes
	BigDecimal balance;
	String accountNum;
	int id;
	BigDecimal minimumBalance = new BigDecimal(1000); //Minimum balance
	
	//withdraw method
	public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
		
		if((minimumBalance.compareTo(balance) <= 0)) { //Minimum balance of R1000 Required to activate withdrawal!
			if((balance.compareTo(amountToWithdraw) < 0)) {
		
			//Insufficient funds , transaction not possible!
			System.err.println("Account Number: " + accountNum + "\n" + "Withdrawal amount too large!, transaction not possible!");
		   }
		
		   else {
			balance = balance.subtract(amountToWithdraw);
			System.out.println("Account Number: " + accountNum + "\n" + "Remaining balance: R" + balance);
		   }
		}
		else {
			System.err.println("Account Number: " + accountNum + "\n" + "You need a minimum balance of R1000");
		}
	}
}
