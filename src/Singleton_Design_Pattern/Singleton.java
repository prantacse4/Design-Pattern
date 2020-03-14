package Singleton_Design_Pattern;

public class Singleton {
	private static Singleton single = new Singleton();
	
	private Singleton() {	
	}
	public static Singleton ektaInstanceRakhbe() {
		return single;
	}
	
	int add(int num1, int num2) {
		return num1+num2;
	}

}
