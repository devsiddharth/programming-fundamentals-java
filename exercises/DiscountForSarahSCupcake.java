import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        // Don’t write System.out.println() statements to enter the  data 
        
        // Write your code here 
        // Calculate and print the price according to the question

        int costOfDozen = sc.nextInt();
        int noOfDozens = sc.nextInt();
        int percentageDiscount = sc.nextInt();

        int totalAmount = costOfDozen*noOfDozens;
        int finalAmount = totalAmount * (100 - percentageDiscount) / 100;

        System.out.println(finalAmount);

        sc.close(); 
    } 
}