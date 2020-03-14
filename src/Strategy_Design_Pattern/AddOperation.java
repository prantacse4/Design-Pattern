package Strategy_Design_Pattern;

public class AddOperation implements Strategy {

		public int operation(int num1, int num2) {
			System.out.println("Adding in Runtime");
			return num1+num2;
		}

}
