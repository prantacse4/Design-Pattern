package Chain_of_Responsibility_Design_Pattern;

public class Number {
	private int num1,num2;
	public Number(int newnum1,int newnum2) {
		this.num1 = newnum1;
		this.num2 = newnum2;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
}
