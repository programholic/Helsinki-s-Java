
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {

        this.tasks = new ArrayList<>();

    }

    public void add(String task) {

        tasks.add(task);

    }

    public void print() {

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }

    }

    public void remove(int number) {
        if (number < 1 || number > tasks.size()) {
            
            System.out.println("Invelid number");  
            return;
        }
        tasks.remove(number - 1);
        
    }

    
    
    
    
    
}

/*
Create a class called TodoList. It should have a constructor without parameters and the following methods:

public void add(String task) - add the task passed as a parameter to the todo list.
public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
TodoList list = new TodoList();
list.add("read the course material");
list.add("watch the latest fool us");
list.add("take it easy");

list.print();
list.remove(2);

System.out.println();
list.print();
Sample output
1: read the course material
2: watch the latest fool us
3: take it easy

1: read the course material
2: take it easy
*/