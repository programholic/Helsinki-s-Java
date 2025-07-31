
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberAmount = 0;

        int sumOfNumbers = 0;
        
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numberAmount = numberAmount +1;
                sumOfNumbers = sumOfNumbers + number;
            }
            
            if (number < 0) {
                numberAmount = numberAmount + 1;
                sumOfNumbers = sumOfNumbers + number;
            }
                   
        }
        
        System.out.println("Number of numbers: " + numberAmount);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
        
        
        
        
        
        
        
        
        
        
    }
}
