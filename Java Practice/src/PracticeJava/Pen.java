package PracticeJava;

public class Pen {
	private String color;
	String s;
	private String brand;
	private int price;
	Pen(String color, String brand, int price){
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	void write()
	{
		System.out.println(color);
		}
	public String getColor() {
		return color;
	}
	
	
}
