package bank;

public class Banker extends Person {
	private Job job;
	
	public Banker(String name,Job job) {
		super(name);
		this.job = job;
		// TODO Auto-generated constructor stub
	}

	public boolean checkwho(Customer cus, Account acc) {
		return job.checkWho(cus, acc);
	}
}
