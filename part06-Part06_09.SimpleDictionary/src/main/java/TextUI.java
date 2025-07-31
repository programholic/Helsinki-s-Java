
import java.util.Scanner;


public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
  public TextUI (Scanner scanner, SimpleDictionary dictionary) {
    
      this.scanner = scanner;
      this.dictionary = dictionary;
      
}  
    
 public void start(){
     
     while (true) {
         System.out.println("Command?");

         String input = scanner.nextLine();
         
         if (input.equalsIgnoreCase("add")){
             System.out.println("Word:");
             String word = scanner.nextLine();
             System.out.println("Translation:");
             String translation = scanner.nextLine();            
             dictionary.add(word, translation);
         }
         
         
         if (input.equalsIgnoreCase("search")){
             System.out.println("To be translated:");
             String search = scanner.nextLine();
             String translation = dictionary.translate(search);

             if (translation == null) {
                 System.out.println("Word " + search + " was not found");
             } else {
                 System.out.println(translation);
             }
                 
             
         }

         if (input.equalsIgnoreCase("end")) {
             System.out.println("Bye bye!");
             break;
         }
         
         if (!input.equalsIgnoreCase("end") && !input.equalsIgnoreCase("search") && !input.equalsIgnoreCase("add")){
             System.out.println("Unknown command");
         }
         
     }

     
 }   
  
 
 /*
 Modify the method public void start() so that it works in the following way:

The method asks the user for a command.
If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
If the command is add, the text UI asks the user for a word and a translation, each on its own line.
After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).
Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.
 */
    
    
    
    
    
    
    
    
    
    
}

/*
Implement the class TextUI that receives as constructor parameters a Scanner and SimpleDictionary objects. 
Then give the class a method called public void start(). The method should work as follows:

The method asks the user for a command
If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.


Scanner scanner = new Scanner(System.in);
SimpleDictionary dictionary = new SimpleDictionary();

TextUI ui = new TextUI(scanner, dictionary);
ui.start();
Sample output
Command: something
Unknown command
Command: add
Unknown command
Command: end
Bye bye!
*/