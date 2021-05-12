package model;

public class StringInstrumentPercussed extends Instrument{
	
	private boolean orientation;
	private String strOrientation;
	private String material;
	private int octaves;
	
	
	public StringInstrument(double height, double length, double width, boolean orientation, String material, int octaves, String id, int place){
		super(height,length,width,id,place);
		
		this.orientation = orientation;
		this.material = material;
		this.octaves = octaves;
	}
	
	//setters
	public void setOrientation(boolean orientation){
		this.orientation = orientation;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	
	public void setOctaves(int octaves){
		this.octaves = octaves;
	}
	
	//getters
	public String getOrientation(){
		if(orientation){
			strOrientation = "Vertical";
		}else{
			strOrientation = "Horizontal";
		}
		
		return strOrientation;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public int getOctaves(){
		return octaves;
	}
}