package com.salary.manager.accounting.account;
import java.util.Date;

//import javax.persistence.Id;

public class Account {
	
	//@Id
	private int accountId;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountDescription() {
		return accountDescription;
	}
	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleteds(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	private String accountNumber;
	private String accountName;
	private String accountDescription;
	private Date createdDate;
	private Date updatedDate;
	private boolean isDeleted;
	

}
