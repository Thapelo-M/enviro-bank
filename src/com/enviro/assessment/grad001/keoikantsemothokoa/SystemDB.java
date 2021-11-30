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
		savingsOne.balance = new BigDecimal(100);
		
		savingsTwo.id = 102;
		savingsTwo.accountNum = "2";
		savingsTwo.balance = new BigDecimal(1000);
		
		currentOne.id = 103;
		currentOne.accountNum = "3";
		currentOne.balance = new BigDecimal(1000);
		currentOne.overdraft = new BigDecimal(10000);
		
		currentOne.id = 104;
		currentOne.accountNum = "4";
		currentOne.balance = new BigDecimal(1000);
		currentOne.overdraft = new BigDecimal(10000);
		
		//Testing accounts against withdraw method
		savingsOne.withdraw("1", new BigDecimal(1500));
		currentOne.withdraw("3", new BigDecimal(1500));
		
	}
}
