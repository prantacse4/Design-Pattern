package Chain_of_Responsibility_Design_Pattern;

public interface Chain {
	
	public void setNext(Chain NextChain);
	public void Calculate(Number request);

}
