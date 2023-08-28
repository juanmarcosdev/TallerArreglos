package ui;

import java.util.Scanner;
import model.Tienda;

public class Main{
	
	Scanner reader;
	Tienda tienda; 
	
	public static void main(String[] args){
		reader = new Scanner(System.in);
		tienda = new Tienda();
		menu();
	}
	
	public static void menu()
	{
		boolean flag = false;
		
		while(!flag){
			System.out.println("Welcome to the store:\n")
			System.out.println("Options:\n" + "1.Add products\n" + "2.See product\n"
								+ "3.Show all products\n" + "4. Return expensiest product\n"
								+ "5.Return cheapest product\n" + "6.Delete product\n"
								+ "7.End");
								
			int option = reader.nextInt();
			
			switch(option){
				case 1:
					System.out.println("Please enter the name of the product");
					String name = reader.nextLine();
					
					System.out.println("Please enter the price of the product");
					double price = reader.nextDouble();
					
					System.out.println("Please enter the amount in the store for this product");
					int units = reader.nextInt();
					
					
					tienda.addProductName(name);
					tienda.addProductPrice(price);
					tienda.addProductUnits(units);
				break;
				case 2:
				
				break;
				case 3:
				
				break;
				case 4:
				
				break;
				case 5:
				
				break;
				case 6:
		
				break;
				case 7:
					flag = true;
					System.exit(0);
				break;
				default:
					System.out.print("Please enter a valid option");
				break;
			}
		}
	}
}

