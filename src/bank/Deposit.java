package bank;

public class Deposit extends Job {
	public Deposit(String task) {
		super(task);
	}
	@Override
	public boolean checkWho(Customer cus, Account acc) {
		// TODO Auto-generated method stub
		return true;
	}
}
