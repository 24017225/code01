
import java.util.Scanner;

public class CompoundInterestDemo {
    
    public static void main(String[] args){
        
        // reads user inputs ftom the console
        Scanner scanner = new Scanner (System.in);
        
        double amount; // It will hold compound Interest result 
        double principal; //It will hold the principle amount
        double rate; //It will hold rate 
        double time; // it holds the time period 
        
        
        System.out.print("Enter Principle amount : ");
        principal = scanner .nextDouble();
        
        System.out.print("Enter the Rate : ");
        rate = scanner .nextDouble();
        
        System.out.print("Enter the time :");
        time = scanner .nextDouble();
        
         // Compound interest formula :
         
         // amount = principal *(1 + rate / 100) ^ time
         
         amount = principal *Math.pow((1 + rate/100) , time);
         
         System.out.println("The Compound Interest is : " + amount);
                 
         
        
    }
}
    

