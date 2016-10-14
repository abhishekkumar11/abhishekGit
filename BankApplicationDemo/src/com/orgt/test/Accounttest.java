package com.orgt.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;

import com.org.exception.InsufficientInitialBalanceException;
import com.org.model.Account;
import com.org.repository.AccountRepository;
import com.org.service.AccountService;
import com.org.service.AccountServiceImpl;


public class Accounttest {


AccountService accountService;

@Mock
AccountRepository accountRepository;



	@Before 
	public void setUp() throws Exception { 
 		 
		MockitoAnnotations.initMocks(this); 
		 
		accountService = new AccountServiceImpl(accountRepository); 
 	} 

	
	/* 
	 	 * test cases for create account 
	 	 * 1. when the amount is less than 500 system should throw exception 
		 * 2. when the valid info is passed account should be created successfully 
		 */ 
	 	 
		@Test(expected = com.org.exception.InsufficientInitialBalanceException.class) 
	 	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InsufficientInitialBalanceException 
	 	{ 
			accountService.createAccount(101, 400); 
		} 

		@Test
		public void createAccountSuccessfull() throws InsufficientInitialBalanceException{
			Account account=new Account();
			account.setAccountNumber(101);
			account.setAmount(5000);
			//accountService.createAccount(101, 600); 
			
			
			
			assertEquals(account, accountService.createAccount(101,5000));
		}
		
}
