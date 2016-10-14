package com.org.service;

import com.org.exception.InsufficientBalanceException;
import com.org.exception.InsufficientInitialBalanceException;
import com.org.exception.InvalidAccountNumberException;
import com.org.model.Account;
import com.org.repository.AccountRepository;

public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository; 
 
 	public AccountServiceImpl(AccountRepository accountRepository) { 
	 		this.accountRepository=accountRepository; 
	 	} 
		@Override 
	 	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialBalanceException { 
		if(amount<500) 
		{ 
	 			throw new InsufficientInitialBalanceException(); 
	 		} 
	 		 
			Account account = new Account(); 
			 
			account.setAccountNumber(accountNumber); 
	 		account.setAmount(amount); 
	 		 
			if(accountRepository.save(account)) 
	 		{ 
	 			return account; 
		} 
			 
	 		return null; 
		} 
	 
	 
	 	@Override 
	 	public int showBalance(int accountNumber) throws InvalidAccountNumberException { 
	 		// TODO Auto-generated method stub 
			return 0; 
		}
		@Override
		public int depositeAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
			// TODO Auto-generated method stub
			return 0;
		} 


}
