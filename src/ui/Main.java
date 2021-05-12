package ui;

import model.*;
import java.util.*;

public class Main{
	private Scanner sc = new Scanner(System.in);
	private Store store = new Store();
	public void Main(String [] args){
		Menu1();
		
	}
	
	public void Menu1(){
		String temp="";
		String jose="";
		temp+="*****************************************************";
		temp+="Bienvenido, Ingresa 1 para agregar un instrumento\n"+
		"Ingresa 2 para listar todos los instrumentos\n"+
		"Ingresa 3 para ver la cantidad de Instrumentos de Viento\n"+
		"Ingresa 4 para ver la cnatidad de Instrumentos de Percusion\n"+
		"Ingresa 5 para ver la cantidad de Instrumentos de Cuerdas";
		
		System.out.println(temp);
		int aux=sc.nextInt();
		sc.nextLine();
		//mmmm
		//int a=sc.int
		//amoun(a)
		switch(aux){
			case 1:
			
			jose+="*****************************************************\n"+
			"Ingrese 1 para crear Instrumento de Viento\n"+
			"Ingrese 2 para crear Instrumento de Percusion Agitado\n"+
			"Ingrese 3 para crear Instrumento de Percusion Frotado\n"+
			"Ingrese 4 para crear Instrumento de Cuerda Percutida\n"+
			"Ingrese 5 para crear Instrumento de Cuerda Pulsada\n"+
			"Ingrese 6 para crear Instrumento de Cuerda Frotada\n";
			
			int juan=sc.nextInt();
			sc.nextLine();
			
			switch(juan){
				
				case 1:
				
				System.out.println("Ingrese el alto del Instrumento");
				double height=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Instrumento");
				double length=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Instrumento");
				double width=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el material del Instrumento");
				String material=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese el ID del Instrumento");
				String id=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento esta en exposicion\n Ingrese 2 si el Instrumento esta en bodega");
				int place=sc.nextInt();
				sc.nextLine();
				
				if (store.addInstrument(height, length, width, material, id, place)){
					
					System.out.println("El Instrumento fue creado con exito");
				}
				else {
					System.out.println("El objeto no pudo ser creado");
				}
				case 2:
				
				System.out.println("Ingrese el alto del Instrumento");
				double height1=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Instrumento");
				double length1=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Instrumento");
				double width1=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el material del Instrumento");
				String material1=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese el ID del Instrumento");
				String id1=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento esta en exposicion\n Ingrese 2 si el Instrumento esta en bodega");
				int place1=sc.nextInt();
				sc.nextLine();
				
				if (store.addInstrument(height, length, width, material, id, place)){
					
					System.out.println("El Instrumento fue creado con exito");
				}
				else {
					System.out.println("El objeto no pudo ser creado");
				}
				
				case 3:
				
				System.out.println("Ingrese el alto del Instrumento");
				double height2=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Instrumento");
				double length2=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Instrumento");
				double width2=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el alto del Elemento Externo");
				double eMHeight2=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Elemento Externo");
				double eMLength2=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Elemento Externo");
				double eMWidth2=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el material del Elemento Externo");
				String eMMaterial2=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese la cantidad de Elementos Externos");
				int eMQuantity2=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese el ID del Instrumento");
				String id2=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento esta en exposicion\n Ingrese 2 si el Instrumento esta en bodega");
				int place2=sc.nextInt();
				sc.nextLine();
				
				if (store.addInstrument(height, length, width, eMHeight, eMLength, eMWidth, eMMaterial, eMQuantity, id, place)){
					
					System.out.println("El Instrumento fue creado con exito");
				}
				else {
					System.out.println("El objeto no pudo ser creado");
				}
				
				case 4:
				
				System.out.println("Ingrese el alto del Instrumento");
				double height3=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Instrumento");
				double length3=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Instrumento");
				double width3=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento se toca en posicion vertical o 2 si se toca en posicion horizontal");
				int orientation3=sc.nextInt();
				boolean ori = false;
				sc.nextLine();
				if(orientation==1){
					ori = true;
				}
				else{
					ori = false;
				}
				
				System.out.println("Ingrese el material del Instrumento");
				String material3=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese la cantidad de octavas del Instrumento");
				int octaves3=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese el  ID del Instrumento");
				String id3=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento esta en exposicion\n Ingrese 2 si el Instrumento esta en bodega");
				int place3=sc.nextInt();
				sc.nextLine();
				
				
				if (store.addInstrument(height, length, width, orientation, material, octaves, id, place)){
					
					System.out.println("El Instrumento fue creado con exito");
				}
				else {
					System.out.println("El objeto no pudo ser creado");
				}
				
				case 5:
				
				System.out.println("Ingrese el alto del Instrumento");
				double height4=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Instrumento");
				double length4=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Instrumento");
				double width4=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese la cantidad de cuerdas del Instrumento");
				int string4=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese la cantidad de trastes del Instrumento");
				int frets4=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento tiene estuche, presione 2 si no tiene estuche");
				int estucheichon4=sc.nextInt();
				boolean cas = false;
				sc.nextLine();
				if(estucheichon==1){
					cas = true;
				}
				else{
					cas = false;
				}
				
				System.out.println("Ingrese el ID del Instrumento");
				String id4=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento esta en exposicion\n Ingrese 2 si el Instrumento esta en bodega");
				int place4=sc.nextInt();
				sc.nextLine();
				
				if (store.addInstrument(height, length, width, string, frets, estucheichon, id, place)){
					
					System.out.println("El Instrumento fue creado con exito");
				}
				else {
					System.out.println("El objeto no pudo ser creado");
				}
				
				case 6:
				
				System.out.println("Ingrese el alto del Instrumento");
				double height5=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Instrumento");
				double length5=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del Instrumento");
				double width5=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese la cantidad de cuerdas del Instrumento");
				int strings5=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese el alto del Arco");
				double heightBow5=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el largo del Arco");
				double lengthBow5=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ancho del arco");
				double widthBow5=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Ingrese el ID del Instrumento");
				String id5=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Ingrese 1 si el Instrumento esta en exposicion\n Ingrese 2 si el Instrumento esta en bodega");
				int place5=sc.nextInt();
				sc.nextLine();
				
				if (store.addInstrument(height, length, width, strings, heightBow, lengthBow, widthBow, id, place)){
					
					System.out.println("El Instrumento fue creado con exito");
				}
				else {
					System.out.println("El objeto no pudo ser creado");
				}
			}
		}
	}
}