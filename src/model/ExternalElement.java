package model;

public class ExternalElement extends PercussionInstrument{
	
	private int quantity;
	
	public PercussionInstrument(double height, double length, double width, String material, int quantity){
		super(height,length,width,material);
		this.quantity=quantity;
	}
	
	public void setquantity (int quantity){
		this.quantity=quantity;
	}
	
	public String getquantity(){
		return quantity;
	}
}