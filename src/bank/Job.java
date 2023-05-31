package bank;

public abstract class Job {
	String task;

	public Job(String task) {
		this.task = task;
	}

	abstract public boolean checkWho(Customer cus, Account acc);
}
