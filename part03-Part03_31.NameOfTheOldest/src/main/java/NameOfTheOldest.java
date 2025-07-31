
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int maxAge = 0;
        String oldestPerson ="";
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int age = Integer.valueOf(parts[1]);
            String name = parts[0].trim();
            
            if (age > maxAge){
                maxAge = age;
                oldestPerson = name;
            }
            
            System.out.println("Name of the oldest person: " + oldestPerson);
        }



    }
}
