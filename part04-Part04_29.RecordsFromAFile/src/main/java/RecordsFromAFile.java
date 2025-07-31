
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner (Paths.get(file))){
            
            while (fileScanner.hasNextLine()){
                
                String line = fileScanner.nextLine().trim();
                
                String [] parts = line.split(",");
                if (parts.length < 2){
                    continue;
                }
                String name = parts[0].trim();
                String agePart = parts[1].trim();
                
                String ageString = agePart.replaceAll("[^0-9]", "");
                int age = Integer.parseInt(ageString);
                
                
               String yearText = (age == 1) ? "year" : "years";
                System.out.println(name + ", age: " + agePart + " " + yearText); 
            }
            
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }                 
      
    
    }
}
/*
Your task is to write a program that first prompts 
the user for the name of the file they want to read. 
The program then prints the content of the file in 
the following way (we're assuming below that the 
output is from the above-mentioned file):

Sample output
Name of the file:
data.txt
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year
*/