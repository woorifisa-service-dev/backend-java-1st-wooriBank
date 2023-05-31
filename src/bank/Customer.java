package bank;

public class Customer extends Person{
	private NumberTicket numberTicket;
	private Account account;
	
	public void setNumberTicket(NumberTicket nt) {
		this.numberTicket = nt;
		if (nt instanceof NumberTicketForLoan) {
			NumberTicketForLoan l = (NumberTicketForLoan)nt;
			System.out.println(this.name+"님, "+l.getTask()+ l.getNum());
		} else {
			NumberTicketForDepo d = (NumberTicketForDepo)nt;
			System.out.println(this.name+"님, "+d.getTask()+ d.getNum());
		}
	}
	
	public Customer(String name) {
		super(name);
		System.out.println(name+"님이 은행에 입장하셨습니다.");
	}
	
	public void walkToCounter(int num) {
		System.out.printf("%d번 창구로 걸어갑니다.\n", num);
	}
	
	public int borrowMoney(int money) {
		say(Integer.toString(money)+"원 내놔!!");
		return money;
	}
	public String getName() {
		return this.name;
	}
}
