
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
   
    ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);
numbers.add(5);
numbers.add(1);
numbers.add(0);

System.out.println("The numbers in the range [0, 5]");
printNumbersInRange(numbers, 0, 5);

System.out.println("The numbers in the range [3, 10]");
printNumbersInRange(numbers, 3, 10);
       
    
    
    }

    private static void printNumbersInRange(ArrayList<Integer> numbers, int i, int i0) {
    
        for (int number : numbers) {
            if (i <= number && i0 >= number) {
                System.out.println(number);
            }
        }


        
        
        
        
        
        
        
        
        
    }
    
}
