
public class Container {
    
    private int container;
    
    
public Container (){
    this.container = 0;
}

public int contains(){
    return this.container;
}


public void add(int amount){
    
        if (amount > 0) {  
            this.container = Math.min(this.container + amount, 100);
        }
}

public void remove(int amount){
    
        if (amount > 0) {  
            this.container = Math.max(this.container - amount, 0);
        }
}



public String toString(){
    
    return this.contains() + "/100";
}







}


