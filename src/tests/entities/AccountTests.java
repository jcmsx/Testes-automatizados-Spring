package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {

	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		/// Padrao AAA
		
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
			
				
		//AA		
				acc.deposit(amount);
				
				Assertions.assertEquals(expectedValue, acc.getBalance());
						
	}
	
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		double expectedValue = 100.0;
		//Account acc = new Account (1l, expectedValue);
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -200.0;
		
		//AA		
		  
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
}
