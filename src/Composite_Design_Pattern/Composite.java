package Composite_Design_Pattern;
import java.util.*;
public class Composite implements Component{
	
	String name;
	List<Component> components = new ArrayList<Component>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addComponent(Component com) {
		components.add(com);
	}
	public void removeComponent(Component com) {
		components.remove(com);
	}
	
	
	public void showPrice() {
		System.out.println("\n"+name+"\n");
		
		for(Component c : components) {
			c.showPrice();
		}
		
	}

}
