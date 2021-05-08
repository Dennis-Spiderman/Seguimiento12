package model;

public class Instrument{
	
	private double height;
	private double length;
	private double width;
	
	public Instrument(double height, double length, double, width){
		this.height=height;
		this.length=length;
		this.width=width;
	}
	//getters
	public void setheight (double height){
		this.height=height;
	}
	public void setlength (double length){
		this.length=length;
	}
	public void setwidht (double width){
		this.width=width;
	}
	//setters
	public double getheight(){
		return height;
	}
	public double getlength(){
		return length;
	}
	public double getwidth(){
		return width;
	}
}