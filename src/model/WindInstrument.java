package model;

public class WindInstrument extends Instrument{
	
	private String material;
	
	public WindInstrument(double height, double length, double width, String material){
		super(height,length,width);
		this.material=material;
	}
	
	public void setmaterial (String material){
		this.material=material;
	}
	
	public String getmaterial(){
		return material;
	}
}