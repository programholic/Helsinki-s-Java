
import java.util.ArrayList;


public class Suitcase {

  private int maxWeight;
  private ArrayList <Item> items;

    public Suitcase(int maximumWeight) {
        this.maxWeight = maximumWeight;
        this.items = new ArrayList <>();
    }

    public Suitcase() {
    }

    
    public void addItem (Item item){
       if (totalWeight() + item.getWeight()<= maxWeight){
           items.add(item);
       }    
    }
    
    public int totalWeight(){
    int totalWeight = 0;
    
    for (Item item:items){
        totalWeight += item.getWeight();
    }
    return totalWeight;
}
    
    public void printItems() {
        for (Item item:items){
            System.out.println(item);
        }

    }
    
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        Item heaviestItem = items.get(0);
        
        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
       
    
    @Override
    public String toString() {
        int numItems = items.size();
        String itemWord = numItems == 1 ? "item":"items";
        
        return numItems == 0 ? "no items (0 kg)": numItems +  " " + itemWord + " (" + totalWeight() + " kg)";
    }


     
    
    
}
