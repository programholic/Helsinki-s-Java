
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            
            
            System.out.println("first: " + first + "/100");
            
            System.out.println("second: " + second + "/100");

            String input = scan.nextLine();
            
            
                        
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            if (input.isEmpty()){
                continue;
            }
            
            
            String [] parts = input.split(" ");
            
            if (parts.length < 2) {
                System.out.println("Invalid command. Please use: add <amount>, move <amount>, remove <amount>");
                continue;
            }

            String command = parts[0];
            int amount;
            
            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
                continue;
            }
            
            if (amount < 0) { 
                continue;
            }
                    
                    
                    
            
            if (command.equalsIgnoreCase("add")){
                first += amount;
                if (first > 100){
                    first = 100;
                }
            }
            
            
            if (command.equalsIgnoreCase("move")){
                
                if (amount > first){
                    amount = first;
                }
                first -= amount;
                second += amount;
                if (second > 100){
                    second = 100;
                }
                
                
            }
            
            
            
            if (command.equalsIgnoreCase("remove")){

                if (amount > second){
                    amount = second;
                }
                second -= amount;
            }


        }
    }

}



