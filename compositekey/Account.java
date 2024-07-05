package com.jsp.compositekey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Account {
	
	
	private int id;
	
	@EmbeddedId
	AccountComposite accountComposite;
	private double balance;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AccountComposite getAccountComposite() {
		return accountComposite;
	}
	public void setAccountComposite(AccountComposite accountComposite) {
		this.accountComposite = accountComposite;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
