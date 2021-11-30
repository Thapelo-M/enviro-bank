package com.enviro.assessment.grad001.keoikantsemothokoa;
import java.math.BigDecimal;

public class SystemDB {
	private static SystemDB instance;
	
	private SystemDB() {
		//private constructor
	}
	
	//method to return the instance
	public static SystemDB getInstance() {
		//if instance is null, initialize
		if(instance == null) {
			instance = new SystemDB();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		//Accounts
		SavingsAccount savingsOne = new SavingsAccount();
		SavingsAccount savingsTwo = new SavingsAccount();
		CurrentAccount currentOne = new CurrentAccount();
		CurrentAccount currentTwo = new CurrentAccount();
		
		//pre-populating accounts 
		savingsOne.id = 101;
		savingsOne.accountNum = "1";
		savingsOne.balance = new BigDecimal(2000);
		
		savingsTwo.id = 102;
		savingsTwo.accountNum = "2";
		savingsTwo.balance = new BigDecimal(5000);
		
		currentOne.id = 103;
		currentOne.accountNum = "3";
		currentOne.balance = new BigDecimal(1000);
		currentOne.overdraft = new BigDecimal(10000);
		
		currentTwo.id = 104;
		currentTwo.accountNum = "4";
		currentTwo.balance = new BigDecimal(-5000);
		currentTwo.overdraft = new BigDecimal(20000);
		
		//Testing accounts against withdraw method
		savingsOne.withdraw("1", new BigDecimal(1500));
		currentOne.withdraw("3", new BigDecimal(1000));
		savingsTwo.withdraw("2", new BigDecimal(2500.50));
		currentTwo.withdraw("4", new BigDecimal(5000));
		
	}
}
