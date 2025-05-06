/******************************************************************************
4/17/2023
Hello, I am Jordyn Reid. This program is for the Frank’s 
Pizzeria restaurant. This program serves the purpose of getting the 
customer’s name, location and what they would like to eat and drink.

*******************************************************************************/
import java.util.Scanner;
public class FranksPizzeria{
	public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
		
	System.out.println("Welcome to Frank's Pizzeria! Please enter a name for the order");
  	String name = input.nextLine();
		
	System.out.println("\nWhat area are you located?!");
  	String location = input.nextLine();
		
	System.out.println("\nWelcome, " + name +" to Frank's Pizzeria located in "+ location);
	System.out.print(" \nBelow is our list of items and the prices. ");
	System.out.println(" \nSlice of pizza: $1.99 ");
	System.out.println(" Soda: $1.25 ");
		
	System.out.println("How many pizza slices would you like?");
  	int pizzaSlice = input.nextInt();
		
	System.out.println("How many sodas would you like?");
  	int soda = input.nextInt();
  		
  	double pizzaPrice = 1.99 * pizzaSlice;
    double sodaPrice = 1.25 * soda;
    double subtotal = pizzaPrice + sodaPrice;
  
    double rateTax = 0.05;
    double tax = subtotal * rateTax;
    double total = subtotal + tax;
  
    double roundedsubtotal = Math.round(subtotal * 100.0) / 100.0;
    double roundedtax = Math.round(tax * 100.0) / 100.0;
    double roundedtotal = Math.round(total * 100.0) / 100.0;
  

  System.out.println("\nJust to confirm, " + name + " your order is: ");
  System.out.println(pizzaSlice + " pizza slices for $1.99 each.");
  System.out.println(soda + " sodas for $1.25 each.");
  System.out.println(name + ", your total before tax is $" + subtotal);
  System.out.println("Tax: $" + roundedtax);
  System.out.println(name + ", your total is: $" + roundedtotal);
  System.out.println("\nThank you for your business.");
        
	}
}
