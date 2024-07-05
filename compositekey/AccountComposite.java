package com.jsp.compositekey;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AccountComposite implements Serializable{
	
	private long accountNumber;
	private int pincode;
	
	
	
	public AccountComposite(long accountNumber, int pincode) {
		this.accountNumber = accountNumber;
		this.pincode = pincode;
	}
	
	public AccountComposite()
	{
		
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountComposite other = (AccountComposite) obj;
		return accountNumber == other.accountNumber && pincode == other.pincode;
	}
	
}
