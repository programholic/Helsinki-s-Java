
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");
// -------------------------------------------------------------------------
        // Implement here
        // asking for the two indices
        // and then swapping them
        
        System.out.println("Give two indices to swap:");
        int input1 = Integer.valueOf(scanner.nextLine());
        int input2 = Integer.valueOf(scanner.nextLine());

        
        int helper = array[input1]; //valor del index 1
        
        array[input1] = array[input2]; //asigno el valor del index 2 al 1
        
        array[input2] = helper; //asigno el valor del index 1 al index 2




// ---------------------------------------------------------------------------
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
