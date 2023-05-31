package bank;

import java.util.Date;

public class Account {
	private Customer owner;
	private String accountNum;
	private int amount;
	
	public void setAmount(int addAmount) {
		this.amount += addAmount;
		System.out.printf("총 %d원 있습니다.\n", this.amount);
	}

	public Account(Customer owner, String accountNum, int amount) {
		this.owner = owner;
		this.accountNum = accountNum;
		this.amount = amount;
	}
	public Customer getOwner() {
		return owner;
	}
}
