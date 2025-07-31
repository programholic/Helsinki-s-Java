
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBirthYears = 0;
        int count = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int birthYear = Integer.valueOf(parts[1]);
            String name = parts[0].trim();
            int length = name.length();
            
            
            if (length > longestName.length()){
               longestName = name;
            }
            
            totalBirthYears += birthYear;
            count += 1;
            
        }
            
            double averageOfBirthYears = (double) totalBirthYears/count;
            
            
            System.out.println("Name of the oldest person: " + longestName);
            System.out.println("Average of birth years: " + averageOfBirthYears);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
