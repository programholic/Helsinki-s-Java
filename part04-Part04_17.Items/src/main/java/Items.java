
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Name:");

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            items.add(new Item(input));

        }

       for (Item item: items){
           System.out.println(item.toString());
       }
    
    }
}



/*
Implement the class Items described here. NB! Don't modify the class Item.

Write a program that reads names of items from the user. 
If the name is empty, the program stops reading. Otherwise, 
the given name is used to create a new item, which you will then add to the items list.

Having read all the names, 
print all the items by using the toString method of the Item class. 
The implementation of the Item class keeps track of the time of creation, 
in addition to the name of the item.

An example of the working program is given below:

Sample output
Name: Hammer
Name: Collar
Name:

Hammer (created at: 06.07.2018 12:34:56)
Collar (created at: 06.07.2018 12:34:57)
*/