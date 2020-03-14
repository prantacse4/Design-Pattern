package Composite_Design_Pattern;

public class Leaf implements Component{
	
	 int price;
	 String name;
	public Leaf(int price , String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public int getPrice(int price) {
		return price;
	}
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showPrice() {
		System.out.println(name+" : "+price);
	}
		

}
