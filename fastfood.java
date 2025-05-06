/******************************************************************************
5/16/2023
Hello, I am Jordyn Reid. This program is for McDonald's. This program serves 
The purpose of getting the customer’s name, location, and what they would like 
to eat and drink.

*******************************************************************************/

import java.util.Scanner;
public class McDonalds{
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
	System.out.println("Welcome to McDonalds! Please enter a name for the order");
	String name = input.nextLine();
	System.out.println("\nWelcome, " + name +" to McDonalds located in Bowie, Maryland.”);
	System.out.print(" \nBelow is our list of items and the prices. ");
	System.out.println(" \nBurger: $1.69 ");
	System.out.println(" \nFries: $1.09 ");
	System.out.println(" Soda: $0.99 ");
		
	System.out.println("How many burgers would you like?");
	int burger = input.nextInt();
	
	System.out.println("How many fries would you like?");
	int fries = input.nextInt();
		
	System.out.println("How many sodas would you like?");
	int soda = input.nextInt();
		
	        double burgerPrice = 1.69 * burger;
        	double sodaPrice = 0.99 * soda;
        	double friesPrice = 1.09 * fries;
        	double subtotal =  burgerPrice + sodaPrice + friesPrice;
        
        	double rateTax = 0.065;
        	double tax = subtotal * rateTax;
        	double total = subtotal + tax;
        
        	double roundedsubtotal = Math.round(subtotal * 100.0) / 100.0;
        	double roundedtax = Math.round(tax * 100.0) / 100.0;
        	double roundedtotal = Math.round(total * 100.0) / 100.0;
          
        
        	System.out.println("\nJust to confirm, " + name + " your order is: ");
        	System.out.println(burger + " burgers for $1.99 each.");
        	System.out.println(soda + " sodas for $1.25 each.");
        	System.out.println(fries + " fries for $1.25 each.");
        	System.out.println(name + ", your total before tax is $" + subtotal);
        	System.out.println("Tax: $" + roundedtax);
        	System.out.println(name + ", your total is: $" + roundedtotal);
        	System.out.println("\nThank you for your business.");
        
	}
}
