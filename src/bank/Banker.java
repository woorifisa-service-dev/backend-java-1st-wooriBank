package bank;

public class Banker extends Person {
	private Job job;
	
	// 생성자
	public Banker(String name,Job job) {
		super(name);
		this.job = job;
	}
	
	
	// 신원 확인 - 손님 이름과 계좌 이름 일치하는지 확인
	public boolean checkwho(Customer cus, Account acc) {
		return job.checkWho(cus, acc);
	}
}
