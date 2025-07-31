
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
    
    
    
    
    
            try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
                
                            // Check if the file has lines to read
            if (!fileScanner.hasNextLine()) {
                System.out.println("The file is empty.");
                return;
            }
            // Read and print each line of the file
            while (fileScanner.hasNextLine()) {
                   
                System.out.println(fileScanner.nextLine());

                }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    
    
    
    }
}
