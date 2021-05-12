package model;

public class ShakenPercussionInstrument extends Instrument{
	
	private String material;
	//builder
	public ShakenPercussionInstrument(double height, double length, double width, String material, String id, int place){
		super(height,length,width,id,place);
		this.material=material;
	}
	
	public void setmaterial (String material){
		this.material=material;
	}
	
	public String getmaterial(){
		return material;
	}
}