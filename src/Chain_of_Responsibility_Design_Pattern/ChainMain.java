package Chain_of_Responsibility_Design_Pattern;

public class ChainMain {
	
	public static void main(String[] args) {
		Chain c1 = new EqualAdd();
		Chain c2 = new Substract();
		
		c2.setNext(c1);
		c1.setNext(c2);
		
		Number request = new Number(4,4);
		c2.Calculate(request);

	}

}
