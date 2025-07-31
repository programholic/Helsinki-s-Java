
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int cubes = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            cubes = (Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input));
            System.out.println(cubes);
        }

    }
}


/*
Write a program that reads strings 
from the user until the user inputs the string "end". 
As long as the input is not "end", 
the program should handle the input as an integer and print the cube of the number provided 
(i.e., number _ number _ number). Below are some sample outputs

Sample output
3
27
-1
-1
11
1331
end
*/