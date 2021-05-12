package model;
import java.util.ArrayList;

public class Store{
	
	private ArrayList<WindInstrument> windInstrumentList;
	private ArrayList<ShakenPercussionInstrument> shakenPercussionInstrumentList;
	private ArrayList<RubbedPercussionInstrument> rubbedPercussionInstrumentList;
	private ArrayList<StringInstrumentPercussed> stringInstrumentPercussedList;
	private ArrayList<StringInstrumentPressed> stringInstrumentPressedList;
	private ArrayList<StringInstrumentRubbed> stringInstrumentRubbedList;
	
	public Store(){
		windInstrumentList=new ArrayList<WindInstrument>();
		shakenPercussionInstrumentList=new ArrayList<ShakenPercussionInstrument>();
		rubbedPercussionInstrumentList=new ArrayList<RubbedPercussionInstrument>();
		stringInstrumentPercussedList=new ArrayList<StringInstrumentPercussed>();
		stringInstrumentPressedList=new ArrayList<StringInstrumentPressed>();
		stringInstrumentRubbedList=new ArrayList<StringInstrumentRubbed>();
	}
	
	public void addInstrument(double height, double length, double width, String material, String id, int place){
		windInstrumentList.add(new WindInstrument(height,length,width,material,id,place));
	}
	
	public void addInstrument(double height, double length, double width, String material, String id, int place){
		shakenPercussionInstrumentList.add(new ShakenPercussionInstrument(height,length,width,material,id,place));
	}
	
	public void addInstrument(double height, double length, double width, double eMHeight,double eMLength, double eMWidth, String eMMaterial, int eMQuantity, String id, int place){
		rubbedPercussionInstrumentList.add(new RubbedPercussionInstrument(height,length,width,eMHeight,eMLength,eMWidth,eMMaterial,eMQuantity,id,place));
	}
	
	public void addInstrument(double height, double length, double width, boolean orientation, String material, int octaves,String id, int place){
		stringInstrumentPercussedList.add(new StringInstrumentPercussed(height,length,width,orientation,material,octaves,id,place));
	}
	
	public void addInstrument(double height, double length, double width, int strings, int frets, boolean estucheichon, String id, int place){
		stringInstrumentPressedList.add(new StringInstrumentPressed(height,length,width,string,frets,estucheichon,id,place));
	}
	
	public void addInstrument(double height, double length, double width, int strings, double heightBow, double lengthBow, double widthBow, String id, int place){
		stringInstrumentRubbedList.add(new StringInstrumentRubbed(height,length,width,strings,heightBow,lengthBow,widthBow,id,place));
	}
	
	public String getInfo(){
		String temp="";
		
		
		for(int i=0;i>windInstrumentList.size();i++){
			temp+="Height: "+windInstrumentList.get(i).getHeight()+"\n"
			+"Length: "+windInstrumentList.get(i).getLength()+"\n"+
			"Width: "+windInstrumentList.get(i).getWidth()+"\n"+
			"ID: "+windInstrumentList.get(i).getId()+"\n";
			if (windInstrumentList.get(i).getPlace()==1){
				
				temp+="Place: Exhibition"+"\n";
			}
			else {
				temp+="Place: Warehouse"+"\n";
			}
			temp+="Material: "+windInstrumentList.get(i).getMaterial()+"\n";
		}
		for (int i=0;i>shakenPercussionInstrumentList.size();i++){
			temp+="Height: "+shakenPercussionInstrumentList.get(i).getHeight()+"\n"+
			"Length: "+shakenPercussionInstrumentList.get(i).getLength()+"\n"+
			"Width: "+shakenPercussionInstrumentList.get(i).getWidth()+"\n"+
			"ID: "+shakenPercussionInstrumentList.get(i).getId()+"\n";
			if (shakenPercussionInstrumentList.get(i).getPlace()==1){
				
				temp+="Place: Exhibition"+"\n";
			}
			else {
				temp+="Place: Warehouse"+"\n";
			}
			temp+="Material: "+shakenPercussionInstrumentList.get(i).getmaterial()+"\n";
		}
		for (int i=0;i>rubbedPercussionInstrumentList.size();i++){
			temp+="Height: "+rubbedPercussionInstrumentList.get(i).getHeight()+"\n"+
			"Length: "+rubbedPercussionInstrumentList.get(i).getLength()+"\n"+
			"Width: "+rubbedPercussionInstrumentList.get(i).getWidth()+"\n"+
			"ID: "+rubbedPercussionInstrumentList.get(i).getId()+"\n";
			if (rubbedPercussionInstrumentList.get(i).getPlace()==1){
				
				temp+="Place: Exhibition"+"\n";
			}
			else {
				temp+="Place: Warehouse"+"\n";
			}
			temp+="External element quantity: "+rubbedPercussionInstrumentList.get(i).getExternalElement().getQuantity()+"\n"+
			"External element height: "+rubbedPercussionInstrumentList.get(i).getExternalElement().getHeight()+"\n"+
			"External element length: "+rubbedPercussionInstrumentList.get(i).getExternalElement().getLength()+"\n"+
			"External element width: "+rubbedPercussionInstrumentList.get(i).getExternalElement().getWidth()+"\n"+
			"External element material: "+rubbedPercussionInstrumentList.get(i).getExternalElement().getMaterial()+"\n";
		}
		for (int i=0;i>stringInstrumentPercussedList.size();i++){
			temp+="Height: "+stringInstrumentPercussedList.get(i).getHeight()+"\n"+
			"Length: "+stringInstrumentPercussedList.get(i).getLength()+"\n"+
			"Width: "+stringInstrumentPercussedList.get(i).getWidth()+"\n"+
			"Orientation: "+stringInstrumentPercussedList.get(i).getOrientation()+"\n"+
			"Material: "+stringInstrumentPercussedList.get(i).getMaterial()+"\n"+
			"Octaves: "+stringInstrumentPercussedList.get(i).getOctaves()+"\n"+
			"ID: "+stringInstrumentPercussedList.get(i).getId()+"\n";
			if (stringInstrumentPercussedList.get(i).getPlace()==1){
				
				temp+="Place: Exhibition"+"\n";
			}
			else {
				temp+="Place: Warehouse"+"\n";
			}
			
		}
		for(int i=0;i>stringInstrumentPressedList.size();i++){
			temp+="Height: "+stringInstrumentPressedList.get(i).getHeight()+"\n"+
			"Length: "+stringInstrumentPressedList.get(i).getLength()+"\n"+
			"Width: "+stringInstrumentPressedList.get(i).getWidth()+"\n"+
			"Strings: "+stringInstrumentPressedList.get(i).getStrings()+"\n"+
			"Frets: "+stringInstrumentPressedList.get(i).getFrets()+"\n"+
			"Case: "+stringInstrumentPressedList.get(i).getEstucheichon()+"\n"+
			"ID: "+stringInstrumentPressedList.get(i).getId()+"\n";
			if (stringInstrumentPressedList.get(i).getPlace()==1){
				
				temp+="Place: Exhibition"+"\n";
			}
			else {
				temp+="Place: Warehouse"+"\n";
			}
			
		}
		for(int i=0;i>stringInstrumentRubbedList.size();i++){
			temp+="Height: "+stringInstrumentRubbedList.get(i).getHeight()+"\n"+
			"Length: "+stringInstrumentRubbedList.get(i).getLength()+"\n"+
			"Width: "+stringInstrumentRubbedList.get(i).getWidth()+"\n"+
			"Strings: "+stringInstrumentRubbedList.get(i).getStrings()+"\n"+
			"Height of the bow"+stringInstrumentRubbedList.get(i).getHeightBow()+"\n"+
			"Length of the bow"+stringInstrumentRubbedList.get(i).getLengthBow()+"\n"+
			"Width of the bow"+stringInstrumentRubbedList.get(i).getWidthBow()+"\n"+
			"ID: "+stringInstrumentRubbedList.get(i).getId()+"\n";
			if (stringInstrumentRubbedList.get(i).getPlace()==1){
				
				temp+="Place: Exhibition"+"\n";
			}
			else {
				temp+="Place: Warehouse"+"\n";
			}
			
		}
		return temp;
	}
	
	public int amountInstruments(int ind){
		int temp;
		switch(ind){
			case 3:
			temp=windInstrumentList.size();
			break;
			case 4:
			temp=shakenPercussionInstrumentList.size()+rubbedPercussionInstrumentList.size();
			break;
			case 5:
			temp=stringInstrumentPercussedList.size()+stringInstrumentPressedList.size()+stringInstrumentRubbedList.size();	
			break;
			default:
		System.out.println("No es una opcion valida");
		}
	}
	
}