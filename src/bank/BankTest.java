package bank;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankTest {

	public static void main(String[] args) throws InterruptedException {
		
		// 손님 객체 & 계좌 만들기
		Customer minsung = new Customer("민성");
		Account minsungAccount = new Account(minsung, "1111-1111", 0);
		
		Loan loan = new Loan("대출");
		Deposit depo = new Deposit("대출");

		// 예금 & 대출 담당 은행원 생성
		Banker depoBanker = new Banker("유정호 강사님", depo);
		Banker loanBanker = new Banker("황철원 반장님", loan);
		
		// 창구 생성
		CounterForLoan counterLoan = new CounterForLoan(1, "대출", loanBanker);
		CounterForDepo counterDepo = new CounterForDepo(2, "예금", depoBanker);

		System.out.println("어떤 업무를 보실건가요? 1번 대출, 2번 예금");
		Scanner sc = new Scanner(System.in);
		int task = sc.nextInt();

		// 대출 업무 선택
		if (task == 1) {
			// 번호표 뽑기
			NumberTicketForLoan ntLoan = new NumberTicketForLoan();
			minsung.setNumberTicket(ntLoan);
			TimeUnit.SECONDS.sleep(1);
			
			// 창구에 사람있는지 확인
			counterLoan.isFull();
			minsung.walkToCounter(counterLoan.num);
			TimeUnit.SECONDS.sleep(2);

			// 새로운 손님
			Customer yoonna = new Customer("윤나");
			NumberTicketForLoan ntLoan1 = new NumberTicketForLoan();
			yoonna.setNumberTicket(ntLoan1);
			TimeUnit.SECONDS.sleep(1);
			counterLoan.isFull();
			TimeUnit.SECONDS.sleep(1);
			
			// 대출금액 말하기
			loanBanker.say(loanBanker.name + " : " + minsung.getName() + "님, 희망하시는 대출금액을 말씀해주세요 : ");
			int money = sc.nextInt();
			
			// 돈 빌리기
			int receiveMoney = minsung.borrowMoney(money);
			TimeUnit.SECONDS.sleep(3);
			
			// 신원확인 완료되면 돈 주고 다음 손님 부르기
			if (loanBanker.checkwho(minsung, minsungAccount)) {
				minsungAccount.setAmount(receiveMoney);
				counterLoan.isAvailable = true;
				TimeUnit.SECONDS.sleep(2);
				counterLoan.isFull();
			}

		}
		
		// 예금 업무 선택
		else if (task == 2) {
			// 번호표 뽑기
			NumberTicketForDepo ntDepo = new NumberTicketForDepo();
			minsung.setNumberTicket(ntDepo);
			counterDepo.isFull();
			minsung.walkToCounter(counterDepo.num);
			TimeUnit.SECONDS.sleep(1);
			
			// 입금 금액 묻기
			depoBanker.say(depoBanker.name + " : " +minsung.getName() + "님, 얼마를 입금하시겠어요? : ");
			int money = sc.nextInt();
			
			int depositMoney = minsung.saveMoney(money);
			TimeUnit.SECONDS.sleep(3);
			
			// 신원확인하고 총금액 말하고 창구 비우기
			if (depoBanker.checkwho(minsung, minsungAccount)) {
				minsungAccount.setAmount(depositMoney);
				counterDepo.isAvailable = true;

			}

		}
		
		sc.close();
	}
}
