
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int input = Integer.valueOf(scanner.nextLine());
        int x = 1;
        int result = 1;
        while (x <= input) {
            result *= x;
            x++;
        }
        System.out.println(result);
    
    
    
    
    
    
    
    
    }
}
