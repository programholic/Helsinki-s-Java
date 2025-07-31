
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
class Archive {

    private String code ;
    private String name ;

public Archive (String identifier, String item){
    this.code = identifier;
    this.name = item;
}

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object compared) {
        
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        return this.code.equals(comparedArchive.code);
 
    }
    
        public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return this.code + ": " + this.name;
        
        
    }
    

    
    

    
    
    
    
    
    
}
