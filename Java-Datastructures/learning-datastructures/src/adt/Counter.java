package adt;

public class Counter {
	
	String name = null;
	int value =0;
	
	public Counter(String str) {
		this.name =str;
	}
	
	public void increment() {
		value++;
	}
	
	public int getCurrentValue() {
		return value;
	}
	
	public String toString() {
		return name + ": " + value;
	}
	
	private void test() {
		System.out.println("test");
	}
	

}
