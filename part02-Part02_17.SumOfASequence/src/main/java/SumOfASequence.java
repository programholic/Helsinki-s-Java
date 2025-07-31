
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Give the number:");
       
        int input1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
       
        int input2 =  Integer.valueOf(scanner.nextLine());
      
        double squareRoot = Math.sqrt(input1 + input2);
    
        System.out.println(squareRoot);

    }
}
