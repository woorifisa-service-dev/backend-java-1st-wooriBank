package bank;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankTest {

	public static void main(String[] args) throws InterruptedException {
		
		Customer minsung = new Customer("민성");
		
		Account minsungAccount = new Account(minsung,"1111-1111",0);
		Loan loan = new Loan("대출");
		
		Banker depoBanker = new Banker("유정호 강사님",loan);
		Banker loanBanker = new Banker("황철원 반장님",loan);
		
		CounterForLoan counterLoan = new CounterForLoan(1,"대출",loanBanker);
		CounterForDepo counterDepo = new CounterForDepo(2,"예금",depoBanker);
		

		System.out.println("어떤 업무를 보실건가요? 1번 대출, 2번 예금");
		Scanner sc = new Scanner(System.in);
		int task = sc.nextInt();
		
		if (task == 1) {
			NumberTicketForLoan ntLoan = new NumberTicketForLoan();
			minsung.setNumberTicket(ntLoan);
			TimeUnit.SECONDS.sleep(1);
			
			counterLoan.isFull();
			minsung.walkToCounter(counterLoan.num);
			TimeUnit.SECONDS.sleep(2);
			
			Customer yoonna = new Customer("윤나");
			NumberTicketForLoan ntLoan1 = new NumberTicketForLoan();
			yoonna.setNumberTicket(ntLoan1);
			TimeUnit.SECONDS.sleep(1);
			counterLoan.isFull();
			
			TimeUnit.SECONDS.sleep(1);
			loanBanker.say(minsung.getName()+"님, 희망하시는 대출금액을 말씀해주세요 : ");
			int money = sc.nextInt();
			int receiveMoney = minsung.borrowMoney(money);
			if (loanBanker.checkwho(minsung,minsungAccount)) {
				minsungAccount.setAmount(receiveMoney);
				counterLoan.isAvailable = true;
				counterLoan.isFull();
			}
			
		} else if (task == 2) {
			NumberTicketForDepo ntDepo = new NumberTicketForDepo();
			minsung.setNumberTicket(ntDepo);
			counterDepo.isFull();
			minsung.walkToCounter(counterLoan.num);
			
		}

	}

}
