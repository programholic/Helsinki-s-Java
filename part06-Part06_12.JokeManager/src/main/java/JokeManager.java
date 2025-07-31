
import java.util.ArrayList;
import java.util.Random;


public class JokeManager {
    
        private ArrayList <String> jokes;
    
    public JokeManager (){
        this.jokes = new ArrayList <> ();
        
    }
    
   public void addJoke(String joke){
       jokes.add(joke);
   }
    
    
   public String drawJoke(){
 
       if (jokes.isEmpty()) {
           return "Jokes are in short supply.";
       } else {
           
           Random random = new Random();
           int randomIndex = random.nextInt(jokes.size());

           return jokes.get(randomIndex);
       }

       
   } 
   
    public void printJokes() {
        
        
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
    
}
/*
public void addJoke(String joke) - adds a joke to the manager.
public String drawJoke() - chooses one joke at random and returns it. It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".
public void printJokes() - prints all the jokes stored in the joke manager.
*/