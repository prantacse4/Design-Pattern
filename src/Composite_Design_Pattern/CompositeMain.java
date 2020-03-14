package Composite_Design_Pattern;

public class CompositeMain {
	
	public static void main (String[] args) {
		
		Component hard = new Leaf(4000,"Hard Disk");
		Component ram  = new Leaf(8000,"RAM");
		Component mouse = new Leaf(500,"Mouse");
		Component usb3 = new Leaf(700,"USB 3.0");
		Component display = new Leaf(10000,"Display");
		
		Composite per = new Composite("Peripherals");
		Composite inter = new Composite("Internal");
		Composite ports = new Composite("Ports");
		Composite computer = new Composite("Computer");
		
		//Composite er moddhe Leaf add Korte Hobe
		
		computer.addComponent(per);
		computer.addComponent(inter);
		per.addComponent(mouse);
		per.addComponent(display);
		inter.addComponent(hard);
		inter.addComponent(ram);
		inter.addComponent(ports);
		ports.addComponent(usb3);
		
		
		computer.showPrice();

		
		
	}

}
