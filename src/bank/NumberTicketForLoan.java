package bank;

public class NumberTicketForLoan extends NumberTicket{
	private static final String task = "대출";
	
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
