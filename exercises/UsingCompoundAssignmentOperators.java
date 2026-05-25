import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        // Write your code here to apply the compound assignment 
        //operators 

        int initialAmount = sc.nextInt();
        int addition = sc.nextInt();
        int subtraction = sc.nextInt();

        System.out.println( initialAmount+addition - subtraction);

        
        sc.close(); 
    } 
}