package bank;

// 사람 추상 클래스
public abstract class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	public void say(String words) {
		System.out.println(words);
	};
}
