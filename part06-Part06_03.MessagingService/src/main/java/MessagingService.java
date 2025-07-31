
import java.util.ArrayList;


public class MessagingService {
  
    private ArrayList <Message> messages;
    
    
    public MessagingService (){
        this.messages = new ArrayList<>();
    }
    
    
    
    public void add(Message message){
        if (message.getContent().length() <= 280) {
            messages.add(message);
        } else{
            System.out.println("Message is longer than 280 characters, and will not be added.");
        }
    }
    
    public ArrayList<Message> getMessages(){
        return new ArrayList<>(messages);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
