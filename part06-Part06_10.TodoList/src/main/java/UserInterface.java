
import java.util.Scanner;


public class UserInterface {
   
private TodoList todo;
private Scanner scanner;

public UserInterface (TodoList todo, Scanner scanner){
    this.todo = todo;
    this.scanner = scanner;
}    

public void start (){
    while (true){
        
        System.out.println("Command:");
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("stop")){
            break;
        }
        
        if (input.equalsIgnoreCase("add")){
            System.out.println("To add:");
            String add = scanner.nextLine();           
            todo.add(add);
        }
        
        if (input.equalsIgnoreCase("list")){
            todo.print();
        }
        
        if (input.equalsIgnoreCase("remove")){
            System.out.println("Which one is removed?");
            int remove = Integer.valueOf(scanner.nextLine());           
            todo.remove(remove);
        }
        
        
    }
}
    
    
    
    
    
    
    
    
}


/*

Next, implement a class called UserInterface. It should have a constructor with two parameters. 

The first parameter is an instance of the class TodoList, and the second is an instance of the class Scanner. 

In addition to the constructor, the class should have the method public void start() that is used to start the text user interface.

The text UI works with an eternal looping statement (while-true), and it must offer the following commands to the user:

The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.

The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.

The commmand list prints all the tasks on the to-do list.

The command remove asks the user to enter the id of the task to be removed. 

When this has been entered, the specified task should be removed from the list of tasks.

Below is an example of how the program should work.

Sample output
Command: add
To add: write an essay
Command: add
To add: read a book
Command: list
1: write an essay
2: read a book
Command: remove
Which one is removed? 1
Command: list
1: read a book
Command: remove
Which one is removed? 1
Command: list
Command: add
To add: stop
Command: list
1: stop
Command: stop
        
        */