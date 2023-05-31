package bank;

// 계좌
public class Account {

	// 계좌 주인, 계좌 번호, 잔액
	private Customer owner;
	private String accountNum;
	private int amount;

	// 생성자
	public Account(Customer owner, String accountNum, int amount) {
		this.owner = owner;
		this.accountNum = accountNum;
		this.amount = amount;
	}

	// 통장에 돈 넣기 및 총 금액 찍기
	public void setAmount(int addAmount) {
		this.amount += addAmount;
		System.out.printf("총 %d원 있습니다.\n", this.amount);
	}

	// 계좌 주인 return
	public Customer getOwner() {
		return owner;
	}
}
