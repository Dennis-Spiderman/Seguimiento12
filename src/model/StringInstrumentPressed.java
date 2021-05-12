package model;

public class StringInstrumentPressed extends Instrument{
	
	private int strings;
	private int frets;
	private boolean estucheichon;
	private String strEstucheichon;
	
	public StringInstrumentPressed(double height, double length, double width, int strings, int frets, boolean estucheichon, String id, int place){
		super(height,length,width,id,place);
		
		this.strings = strings;
		this.frets = frets;
		this.estucheichon = estucheichon;
	}
	
	//setter
	public void setStrings(int strings){
		this.strings = strings;
	}
	
	public void setFrets(int frets){
		this.frets = frets;
	}
	
	public void setEstucheichon(boolean estucheichon){
		this.estucheichon = estucheichon;
	}
	//getters
	public int getStrings(){
		return strings;
	}
	
	public int getFrets(){
		return frets;
	}
	
	public String getEstucheichon(){
		if(estucheichon){
			strEstucheichon = "Yes";
		}else{
			strEstucheichon = "Nope";
		}
		
		return strEstucheichon;
	}
}