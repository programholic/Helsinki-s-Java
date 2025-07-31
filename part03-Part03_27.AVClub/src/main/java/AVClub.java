
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String pieces[] = input.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                
              String text = pieces[i];
              
              if (text.contains(("av")) || text.contains("Av")){
                  
                  System.out.println(text);
                     
              }
                
                
                
                
            }

            
            
            
            
            
            
            
            
        }

    }
}
