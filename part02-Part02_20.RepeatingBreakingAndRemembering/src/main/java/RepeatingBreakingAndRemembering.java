
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

// part 1 Reading
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers: ");
        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;

            }

            if (input > 0) {
                sum += input;
                numbers++;
            }

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);

        double average = (double) sum / numbers;
        System.out.println("Average: " + average);

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

//Part 2 sum of  numbers        
// Part 3 adding a numbers counter        
// Part 4 adding the average        
// Part 5 adding even and odd counters        
    }
}
