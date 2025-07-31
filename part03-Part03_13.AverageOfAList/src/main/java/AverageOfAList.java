
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
    // implement here a program, that first reads user input
    // adding them on a list until user gives -1.
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);

        }
        

        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int sum = 0;
        
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            sum = sum + value;
        }
        
        double average = (double) sum/list.size();
        
        System.out.println("Average: " + average);
        
        
    }
}
