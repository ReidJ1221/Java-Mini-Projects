/******************************************************************************
5/19/2023
Hello, I am Jordyn Reid. This program is for roman numeral 
conversion. This program serves the purpose getting numbers 11
through 20 to appear in the correct roman numeral format.
*******************************************************************************/

public class FinalPart{
    public static void main(String[] args) {
        for (int i = 11; i <= 20; i++) {
            try {
                String romanNumeral = convertToRomanNumeral(i);
                System.out.println(i + " = " + romanNumeral);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    public static String convertToRomanNumeral(int number) {
        if (number < 10|| number > 20) {
            throw new IllegalArgumentException("Number must be between 1 and 20 (inclusive).");
        }
        
        StringBuilder romanNumeral = new StringBuilder();
        
        String[] romanMappings = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"
        };
        
        int index = number - 1;
        return romanMappings[index];
    }
}
