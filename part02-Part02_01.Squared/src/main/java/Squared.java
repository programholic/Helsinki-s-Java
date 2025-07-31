
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
      
       /* burger restaurant system, after 1000th customer every 25th gets
        a giftcard and once it reaches 2000th customer a bigger one. Others
        get nothing other than the service.
        */
        
        Scanner x = new Scanner(System.in);
        while (true){
        System.out.println("Customer number: "); // asks for the customer number
        int y = Integer.valueOf(x.nextLine()); // reads the customer number
        // y now equals "customer number".
        
                    // if /2000 == 0 get a bigger card
        if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        // if y is = or higher than 1000 and % 25 get a giftcard.
       // moved it to the top of the conditionals due to it being a bigger
       // condition than the rest, getting the correct answer every 2000 
       // customers.
        
        } else if (y >= 1000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");
            

        } else {
            System.out.println("Gets nothing.");
        }
// otherwise get nothing
    }
}
}
