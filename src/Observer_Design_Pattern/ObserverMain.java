package Observer_Design_Pattern;

public class ObserverMain {
	public static void main(String [] args) {
		Subject subject = new Subject();
		Observer addOb = new add(subject);
		Observer biyogOb = new biyog(subject);
		System.out.println("First State All Result");
		subject.setState(10);
		
		System.out.println("Second State Only ADD Result");
		subject.deattach(biyogOb);
		subject.setState(10);
		
		
		
		
	}

}
