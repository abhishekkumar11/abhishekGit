package com.org.service;

import com.org.exception.InsufficientBalanceException;
import com.org.exception.InsufficientInitialBalanceException;
import com.org.exception.InvalidAccountNumberException;
import com.org.model.Account;

public interface AccountService {


	int depositeAmount(int accountNumber, int amount)throws InvalidAccountNumberException;
	
	Account createAccount(int accountNumber,int amount)throws InsufficientInitialBalanceException; 
	 
		int showBalance(int accountNumber) throws InvalidAccountNumberException; 
	
	 


}
