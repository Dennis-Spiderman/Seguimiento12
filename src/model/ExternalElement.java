package model;

public class ExternalElement{
	
	private int quantity;
	private double height;
	private double length;
	private double width;
	private String material;

	public ExternalElement(double height, double length, double width, String material, int quantity){
		this.height=height;
		this.quantity=quantity;
		this.length=length;
		this.width=width;
		this.material=material;
	}
	
	public void setQuantity (int quantity){
		this.quantity=quantity;
	}
	
	public void setHeight (double height){
		this.height=height;
	}
	
	public void setLength (double length){
		this.quantity=quantity;
	}
	
	public void setWidth (double width){
		this.width=width;
	}
	
	public void setMaterial (String material){
		this.material=material;
	}
	
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public String getMaterial(){
		return material;
	}
	
}