package model;

public class Tienda{
	
	String[] names;
	double[] prices;
	int[] units;
	
	public Tienda(){
		names = new String[10];
		prices = new double[10];
		units = new int[10];

	// Inicializar los elementos de las matrices
	    for (int i = 0; i < 10; i++) {
	        names[i] = "";  // Inicializar con cadenas vacías
	        prices[i] = 0.0;  // Inicializar con 0.0
	        units[i] = 0;  // Inicializar con 0
	    }
	}
	
	public void addProductName(String name){
		
		boolean flag = false;
		// Recorrido Parcial
		for(int i=0; i<names.length && flag == false; i++){
			if(names[i].isEmpty()){
				names[i] = name;
				flag = true;
			}
		}
	}
	
	public void addProductPrice(double price){
		boolean flag = false;	
		for(int i=0; i<prices.length && flag == false; i++){
			if(prices[i] == 0.0){
				prices[i] = price;
				flag = true;
			}
		}
	}
	
	public void addProductUnits(int unit){
		boolean flag = false;
		for(int i=0; i<units.length && flag == false; i++){
			if(units[i] == 0){
				units[i] = unit;
				flag = true;
			}
		}
	}
}
