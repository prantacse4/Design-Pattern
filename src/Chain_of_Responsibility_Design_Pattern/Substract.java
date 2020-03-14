package Chain_of_Responsibility_Design_Pattern;

public class Substract implements Chain{
	private Chain nextChain;
	
	public void setNext(Chain chain) {
		this.nextChain = chain;
	}
	public void Calculate(Number request) {
		if((request.getNum1()>request.getNum2()) || (request.getNum1()>request.getNum2())){
			System.out.println("In Substract Numbers are not Equal (Substract Korbo)\n Substract Result : "+(request.getNum1()-request.getNum2()));
		}
		else {
			System.out.println("\n(Add er moddhe Result khuje Paini Next Chain e Jaabo)\n ");
			nextChain.Calculate(request);
		}
	}

}
