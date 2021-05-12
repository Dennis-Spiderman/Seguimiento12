package model;

public class WindInstrument extends Instrument{
	
	private String material;
	
	public WindInstrument(double height, double length, double width, String material, String id, int place){
		super(height,length,width,id,place);
		this.material=material;
	}
	
	public void setMaterial (String material){
		this.material=material;
	}
	
	public String getMaterial(){
		return material;
	}
}