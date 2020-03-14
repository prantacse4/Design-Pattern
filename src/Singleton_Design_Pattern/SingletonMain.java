package Singleton_Design_Pattern;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton single = Singleton.ektaInstanceRakhbe();
		System.out.println("2+1 = "+single.add(2, 1));
	}

}
