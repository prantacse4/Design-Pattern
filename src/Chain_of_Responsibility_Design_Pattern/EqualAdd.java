package Chain_of_Responsibility_Design_Pattern;

public class EqualAdd implements Chain{
	
	private Chain nextChain;
	
	public void setNext(Chain chain) {
		this.nextChain = chain;
	}
	
	public void Calculate(Number request) {
		if (request.getNum1()==request.getNum2()) {
			System.out.println("In Equal Add Numbers are Equal (Sum Korbo)\n Sum Result : "+(request.getNum1()+request.getNum2()));
		}
		else {
			System.out.println("\n(Equal add er moddhe Result khuje Paini Next Chain e Jaabo)\n ");
			nextChain.Calculate(request);
		}
		
	}
		

}
