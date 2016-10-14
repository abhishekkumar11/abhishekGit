package com.org.repository;

import com.org.model.Account;

public interface AccountRepository {

	boolean save(Account account);
	Account searchAccount(int accountNumber);
}
