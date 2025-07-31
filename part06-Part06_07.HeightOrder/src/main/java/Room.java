
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;
    
    public Room () {
    this.room = new ArrayList <>();
}

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
       return room.isEmpty();     
    }

    public ArrayList<Person> getPersons() {
        return this.room;           
    }

public Person shortest(){
    
    if (room.isEmpty()){
        return null;
    }
    Person shortestPerson = this.room.get(0);
    
    
    for (Person rooms:room){
        if(shortestPerson.getHeight()>rooms.getHeight()){
            shortestPerson = rooms;
        }        
    }
    return shortestPerson;
}
    
    public Person take() {
        if (room.isEmpty()){
            return null;
        }
    Person findShortest = shortest();
    this.room.remove(findShortest);
    return findShortest;
       
    }
    
    
    
    
    
    
    
}
