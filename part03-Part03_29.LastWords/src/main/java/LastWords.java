
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            String split [] = input.split(" ");
            
            int lastWordIndex = split.length - 1;
            String lastWord = split[lastWordIndex];
            
            System.out.println(lastWord);
            
            
        }
    
    
    
    
    
    
    
    
    
    }
}
