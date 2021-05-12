package model;

public class RubbedPercussionInstrument extends Instrument{
	
	private ExternalElement externalElement;
	//builder
	public RubbedPercussionInstrument(double height, double length, double width, double eMHeight,double eMLength, double eMWidth, String eMMaterial, int eMQuantity, String id, int place){
		super(height,length,width,id,place);
		externalElement=new externalElement(eMHeight, eMLength, eMWidth, eMMaterial, eMQuantity);
	}
	public void setExternalElement (ExternalElement A){
		this.externalElement=A;
	}
	
	public ExternalElement getExternalElement(){
		return externalElement;
	}
}	