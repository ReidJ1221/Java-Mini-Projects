/******************************************************************************
5/1/2023
Hello, I am Jordyn Reid. This program is for the US Health 
Department. This program serves the purpose of gauging whether the 
user qualifies for a booster shot based on whether they took a COVID-19 vaccine 
shot and, if so, which one they took.
*******************************************************************************/
import java.util.Scanner;

public class HealthDepartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome, would you like to use our application? (Yes or No)");
        String response = scanner.nextLine();
        
        if (response.equalsIgnoreCase("no")) {
            System.out.println("You chose no, goodbye and thank you for using our program!");
            System.exit(0);
        } else if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter your first name:");
            String firstName = scanner.nextLine();
            
            System.out.println("Enter your last name:");
            String lastName = scanner.nextLine();
            
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Enter your zip code:");
            String zipCode = scanner.nextLine();
            
            System.out.println("Thank you for entering your information:");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Zip code: " + zipCode);
            
            System.out.println("Please select a Covid 19 Vaccine from the menu:");
            System.out.println("1- Pfizer-BioNTech");
            System.out.println("2- Moderna");
            System.out.println("3- Johnson & Johnson's");
            System.out.println("4- Other");
            
            int vaccineChoice = scanner.nextInt();
            scanner.nextLine();
            
            switch (vaccineChoice) {
                case 1:
                    System.out.println("You have been vaccinated with the Pfizer-BioNTec vaccine and qualify for a booster shot!");
                    break;
                case 2:
                    System.out.println("You have been vaccinated with the Moderna's vaccine and qualify for a booster shot!");
                    break;
                case 3:
                    System.out.println("You have been vaccinated with the Johnson & Johnson's vaccine and qualify for a booster shot!");
                    break;
                case 4:
                    System.out.println("You have been vaccinated with a vaccine other than the Pfizer-BioNTech, Moderna, Johnson & Johnson's, and may NOT qualify for a booster shot!");
                    break;
            }
        } else {
            System.out.println("You entered an invalid response, Goodbye!");
        }
    }
}
