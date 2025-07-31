
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container ();
        
        
        while (true) {
            
            
            System.out.println("first: " + first.toString());
            
            System.out.println("second: " + second.toString());

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
                    
                    
                    
            
            if (command.equalsIgnoreCase("add")) {
                first.add(amount);
                
                if (first.contains() > 100) {
                    first.remove(first.contains());
                    first.add(100);
                }
            }
            
            
            if (command.equalsIgnoreCase("move")){
                
                if (amount > first.contains()){
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
                if (amount > 100){
                    amount = 100;
                    second.add(amount);
                }
                
                
            }
            
            
            
            if (command.equalsIgnoreCase("remove")){

                if (amount > second.contains()){
                    amount = second.contains();
                }
                second.remove(amount);
            }


        }

    }

}

