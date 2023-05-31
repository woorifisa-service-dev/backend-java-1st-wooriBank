package bank;

public abstract class Counter {
	int num;
	String job;
	Banker banker;
	Customer customer;
	boolean isAvailable = true;

	abstract public void isFull();

}
