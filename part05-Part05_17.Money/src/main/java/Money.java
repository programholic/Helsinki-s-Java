
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    } 
    
    public Money plus(Money addition) {

        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        Money newMoney = new Money(totalEuros, totalCents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }
        return false;

    }
    
    
    public Money minus(Money decreaser) {
        int eurosResult = this.euros - decreaser.euros;
        int centsResult = this.cents - decreaser.cents;
        
        
        if (centsResult <0){
            
            eurosResult -= 1;
            centsResult += 100;
            
        }
        
        if (eurosResult < 0){
            
            eurosResult = 0;
            centsResult = 0;
        }
          
        Money minus = new Money(eurosResult, centsResult);
        
        return minus;
 }   
    

}
