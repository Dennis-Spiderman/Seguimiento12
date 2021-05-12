package model;

public class Instrument{
	
	private double height;
	private double length;
	private double width;
	private String id;
	private int place;
	
	public Instrument(double height, double length, double width, String id, int place){
		this.height=height;
		this.length=length;
		this.width=width;
		this.id=id;
		this.place=place;
	}
	
	public void setHeight (double height){
		this.height=height;
	}
	public void setLength (double length){
		this.length=length;
	}
	public void setWidht (double width){
		this.width=width;
	}
	public void setId (String id){
		this.id=id;
	}
	public void setPlace (int place){
		this.place=place;
	}
	//setters
	public double getHeight(){
		return height;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public String getId(){
		return id;
	}
	public int getPlace(){
		return place;
	}
	//getters
}