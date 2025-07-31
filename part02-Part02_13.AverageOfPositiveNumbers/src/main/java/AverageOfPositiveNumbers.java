
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double positives = 0;
        
        while (true){ 
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0){ 
                sum = sum + number;
                positives = positives + 1;
            }
            
            
        }
        
        double averageOfPositives = (sum/positives);
        
        if (sum == 0) {
            System.out.println("Cannot Calculate the average");
        }
        
        if (sum > 0) {
            System.out.println(averageOfPositives);
        }
    
    
    
    
    
    
    
    
    }
}
