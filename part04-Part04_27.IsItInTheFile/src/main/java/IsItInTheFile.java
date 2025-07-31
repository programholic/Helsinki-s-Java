
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

     
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            boolean found = false;
            
            while (fileScanner.hasNextLine()) {
                String find = fileScanner.nextLine();
              
                
                if (find.contains(searchedFor)) {
                found = true;
                break;
                } 
         
            }
            if (found){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file: " + file + "failed");
        }


    
    
    /*
        The exercise template comes with two files,
        names.txt and other-names.txt. 
        Write a program that first asks the user for the name of the file to be read,
        after which the user is prompted for the string that they're looking for.
        The program then reads the file and searches for the desired string.

        If the string is found, 
        the program should print "Found!". If not, 
        the program should print "Not found.". 
        If reading the file fails (the reading ends in an error) 
        the program should print the message "Reading the file " + file + " failed.".
        */
    
    
    
    
    
    
    
    }
}
