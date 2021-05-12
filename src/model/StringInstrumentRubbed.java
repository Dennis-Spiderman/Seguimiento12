package model;

public class StringInstrumentRubbed extends Instrument{
	
	private int strings;
	private double heightBow;
	private double lengthBow;
	private double widthBow;
	
	public StringInstrumentRubbed(double height, double length, double width, int strings, double heightBow, double lengthBow, double widthBow, String id, int place){
		super(height,length,width,id,place);
		
		this.strings = strings;
		this.heightBow = heightBow;
		this.lengthBow = lengthBow;
		this.widthBow = widthBow;
		
	}
	
	//setters
	public void setStrings(int strings){
		this.strings = strings;
	}
	
	public void setHeightBow(double heightBow){
		this.heightBow = heightBow;
	}
	
	public void setLengthBow(double lengthBow){
		this.lengthBow = lengthBow;
	}
	
	public void setWidthBow(double widthBow){
		this.widthBow = widthBow;
	}
	
	//getters
	public int getStrings(){
		return strings;
	}
	
	public double getHeightBow(){
		return heightBow;
	}
	
	public double getLengthBow(){
		return lengthBow;
	}
	
	public double getWidthBow(){
		return widthBow;
	}
}