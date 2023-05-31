package bank;

// 예금 창구 번호표
public class NumberTicketForDepo extends NumberTicket{
	
	private static final String task = "예금";
	
	// 예금 창구 전용 누적 고객수
	private static int last = 1;
	
	public String getTask() {
		return task;
	}
	
	
	public void setLast() {
		++last;
	}
	
	public int getLast() {
		return last;
	}
	
	public int getNum() {
		setNum();
		setLast();
		return this.num;
	}
	
	public void setNum() {
		this.num = getLast();
	}
}
