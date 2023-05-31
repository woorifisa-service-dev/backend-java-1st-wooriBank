package bank;

// 예금 업무
public class Loan extends Job {

	public Loan(String task) {
		super(task);
	}
	
	// 신원 확인
	@Override
	public boolean checkWho(Customer cus, Account acc) {
		if(cus.getName() == acc.getOwner().getName()){
			System.out.println("신원 확인되었습니다.");
			return true;
		} 
		else {
			System.out.println("너꺼 가져와.");
			return false;
		}
	}

	public void lendMoney(Customer cus) {
		System.out.println("test");
	}

}
