
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
   
     /*
        Multiple sums
Change the previous program so that it also calculates the sum of even and odd numbers.

NOTE: Define three Statistics objects in the program. 
        Use the first to calculate the sum of all numbers, 
        the second to calculate the sum of even numbers, 
        and the third to calculate the sum of odd numbers.

For the test to work, 
        the objects must be created in the main program in the order they were mentioned above 
        (i.e., first the object that sums all the numbers, then the one that sums the even ones,
        and then finally the one that sums the odd numbers)!

NOTE: Do not change the Statistics class in any way!

The program should work as follows:

Sample output
Enter numbers:
4
2
5
2
-1
Sum: 13
Sum of even numbers: 8
Sum of odd numbers: 5
        */
        
        int sum = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        System.out.println("Enter numbers:");
        
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            allNumbers.addNumber(input);

            /* even */ if (input % 2 == 0) {
                evenNumbers.addNumber(input);
            }

            /* odd */ if (input % 2 != 0) {
                oddNumbers.addNumber(input);
            }

        }

        System.out.println("Count: " + allNumbers.getCount());
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of Even numbers: " + evenNumbers.sum());
        System.out.println("Sum of Odd Numbers: " + oddNumbers.sum());
        System.out.println("Average: " + allNumbers.average());
   
    }
}
