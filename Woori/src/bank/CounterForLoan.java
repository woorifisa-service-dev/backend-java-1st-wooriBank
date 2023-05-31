package bank;

public class CounterForLoan extends Counter {
	
	public static int currentOrder = 0;

	public CounterForLoan(int num, String job, Banker banker) {
		this.num = num;
		this.job = job;
		this.banker = banker;
	}

	@Override
	public void isFull() {
		if (this.isAvailable == true) {
			// 비었으면
			currentOrder += 1;
			System.out.printf("%d번 손님 %d창구로 오시면 됩니다. \n", currentOrder, this.num);
			isAvailable = false;
		} else if (this.isAvailable == false) {
			System.out.println("조금만 대기해주세요");
		}
	}
}