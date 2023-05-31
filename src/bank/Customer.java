package bank;

// 손님
public class Customer extends Person {
	
	// 들고있는 번호표, 계좌
	private NumberTicket numberTicket;
	private Account account;

	// 번호표 뽑기
	public void setNumberTicket(NumberTicket nt) {
		this.numberTicket = nt;
		if (nt instanceof NumberTicketForLoan) {
			NumberTicketForLoan l = (NumberTicketForLoan) nt;
			System.out.println("기계음 : " + this.name + "님, " + l.getTask() + "창구 대기번호 " + l.getNum() + "번 입니다.");
		} else {
			NumberTicketForDepo d = (NumberTicketForDepo) nt;
			System.out.println("기계음 : " + this.name + "님, " + d.getTask() + "창구 대기번호 " + d.getNum() + "번 입니다.");
		}
	}

	public Customer(String name) {
		super(name);
		System.out.println(name + "님이 은행에 입장하셨습니다.");
	}

	public void walkToCounter(int num) {
		System.out.printf("%s : %d번 창구로 걸어갑니다.\n", name, num);
	}

	public int borrowMoney(int money) {
		say(name + " : " + Integer.toString(money) + "원 내놔!!");
		return money;
	}

	public int saveMoney(int money) {
		say(name + " : " + Integer.toString(money) + "원 입금할게요");
		return money;
	}

	public String getName() {
		return this.name;
	}
}
