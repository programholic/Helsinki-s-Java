
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        if (elements.isEmpty()) {
            return "The collection " + this.name +  " is empty.";
        } else {

        String printOut =  "The collection " + this.name +  " has " + elements.size() + " element" + (elements.size() == 1 ? "" : "s") + ":\n";
            
            
           for (int i = 0; i < elements.size(); i++) {
            printOut += elements.get(i);
            if (i < elements.size() - 1) {
                printOut += "\n";  // Add a newline after each element except the last one
            }
           }
            
            return printOut;
            
        }
  
    }
    
    
    
    
    
    
    
    
}

