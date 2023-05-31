package bank;

// 예금 창구
public class CounterForDepo extends Counter {

	// 현재 번호
	public static int currentOrder = 0;
	
	public CounterForDepo(int num,	String job,Banker banker) {
		this.num = num;
		this.job = job;
		this.banker = banker;
	}
	
	// 창구가 차있는지 확인
	@Override
	public void isFull() {
		if (this.isAvailable == true) {
			// 비었으면
			currentOrder += 1;
			System.out.printf("%s : %d번 손님 %d창구로 오시면 됩니다. \n",banker.name, currentOrder, this.num);
			isAvailable = false;
		} else if (this.isAvailable == false) {
			System.out.println("조금만 대기해주세요");
		}
	}
	
}
