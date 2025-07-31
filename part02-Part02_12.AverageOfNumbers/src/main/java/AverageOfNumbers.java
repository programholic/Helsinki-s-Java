
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double amountOfNumbers = 0;
        
        while (true) {
            
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum = sum + number;
                amountOfNumbers = amountOfNumbers +1;
            }
            
            if (number < 0) {
                sum = sum + number;
                amountOfNumbers = amountOfNumbers + 1;
            }
                   
        }
        
        double averageNumbers = (sum / amountOfNumbers);
        
        System.out.println("Average of the numbers: " + averageNumbers);
        
        
        
        
        
        
        
        
        
        
        
    }
}
