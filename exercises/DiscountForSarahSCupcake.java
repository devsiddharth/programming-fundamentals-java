import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        // Don’t write System.out.println() statements to enter the  data 
        
        // Write your code here 
        // Calculate and print the price according to the question

        double costOfDozen = sc.nextDouble();
        double noOfDozens = sc.nextDouble();
        double percentageDiscount = sc.nextDouble();

        double totalAmount = costOfDozen * noOfDozens;
        double discountAmount = totalAmount * (percentageDiscount / 100.0);
        double finalAmount = totalAmount - discountAmount;

        // Math.round() rounds 44.99 up to 45, and 44.11 down to 44
        // (long) ensures it can hold large numbers without breaking
        long roundedFinalAmount = Math.round(finalAmount);

        System.out.println(roundedFinalAmount);

        sc.close(); 
    } 
}