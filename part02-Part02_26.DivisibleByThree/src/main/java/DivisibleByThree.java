
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        
        divisibleByThreeInRange(3,12);
    }


    public static void divisibleByThreeInRange(int beginning, int end){
        int x = beginning;
        while (x <= end) {
            if (x % 3 == 0) {
                System.out.println(x);  
            }
            x++;   

        }
    }
}
