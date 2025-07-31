
import java.util.ArrayList;


public class Stack {
 
    private ArrayList<String> stacks;
    
    public Stack (){
    this.stacks = new ArrayList<>();
}
    
  public boolean isEmpty(){
      return stacks.isEmpty();
  }  
    
    public void add(String value){
     stacks.add(value);   
    }
    
  public ArrayList<String> values(){
      return new ArrayList<>(stacks);
      
  }  
 
  public String take(){

      if (stacks.isEmpty()){
          return null;
      }
      
     return stacks.remove(stacks.size() -1);  

  }
  
}









/*
Create a Stack class that has a list of strings as an instance variable. Add the following methods to the class:

public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.

public void add(String value) - Adds the value given as a parameter to the top of the stack.

public ArrayList<String> values() - returns the values ​​contained in the stack as a list.
*/