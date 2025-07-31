
import java.util.ArrayList;


public class Hold {
    
private int maxWeight;
private ArrayList <Suitcase> suitcases;


public Hold (int maxWeight){
    this.maxWeight = maxWeight;
    this.suitcases = new ArrayList<>();
}
    
    
 public void addSuitcase(Suitcase suitcase){
     
     if ((totalWeight() + suitcase.totalWeight()) <= maxWeight) {

         suitcases.add(suitcase);
     }
 }   
    
 
 private int totalWeight(){
     int totalWeight = 0;
     
     for (Suitcase suitcase:suitcases){
         totalWeight += suitcase.totalWeight();
     }
     return totalWeight;
 }
 
 
 public void printItems(){
     for (Suitcase suitcase : suitcases) {

         suitcase.printItems();

     }

     
 }
 
 
public String toString(){
     
        int numSuitcases = suitcases.size();
        String suitcaseWord = numSuitcases == 1 ? "suitcase" : "suitcases";

        return numSuitcases == 0 ? "no suitcases (0 kg)" : numSuitcases + " " + suitcaseWord + " (" + totalWeight() + " kg)";
    }



}
        
    
    
    
    
    
    
    
    
    
    
    

