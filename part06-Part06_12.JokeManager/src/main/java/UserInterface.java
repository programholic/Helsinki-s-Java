
import java.util.Scanner;

/*
Create a class called UserInterface and move the UI functionality of the program there. 
The class must have a constructor with two parameters. 
The first parameter is an instance of the JokeManager class, 
and the second parameter is an instance of the Scanner class. 
In addition, the class should have the method public void start() 
that can be used to start the user interface.

The user interface should provide the user with the following commands:

X - ending: exits the method start.
1 - adding: asks the user for the joke to be added to the joke manager, and then adds it.
2 - drawing: chooses a random joke from the joke manager and prints it. 
If there are no jokes in the manager, thi string "Jokes are in short supply." will be printed.
3 - printing: prints all the jokes stored in the joke manager.
 */
public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;
    
public UserInterface(JokeManager joke, Scanner scanner){
    this.joke = joke;
    this.scanner = scanner;
 
}    
  

public void start (){
  while (true){
      
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("X")) {
          System.out.println("Ending.");
          break;
      }
      
      
      if (input.equals("1")){
          System.out.println("Write joke to be added:");
          String joke = scanner.nextLine();
          
          this.joke.addJoke(joke);
      }
      
      if (input.equals("2")){

          System.out.println(this.joke.drawJoke());
          
          
      }
      
      
      if (input.equals("3")){
          System.out.println("Printing the jokes.");
          this.joke.printJokes();
      }
       
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
