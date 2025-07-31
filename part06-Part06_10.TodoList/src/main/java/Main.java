
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes

        
        
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        
        System.out.println("");
        
        // prints 1. read the course material , 2. watch the latest fool us, 3. take it easy
        list.remove(2);
        list.print();
        
        System.out.println("");
        // should print 1. read the course material, 2. take it easy
        list.add("buy raisins");
        list.print();
        // should print 1. read the course material, 2. take it easy, 3. buy rasins
        
        System.out.println("");
        
        
        list.remove(1);
        list.remove(1);
        list.print();
// should print 1. buy rasins
    }
}
