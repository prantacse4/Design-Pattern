package Strategy_Design_Pattern;

public class MultiplyOperation implements Strategy{
	
	public int operation(int num1, int num2) {
		System.out.println("Multiplying in runtime");
		return num1*num2;
	}

}
