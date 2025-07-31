/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class PaymentCard {
    

  private double balance;

    public PaymentCard(double openingBalance) {
       
        this.balance = openingBalance;


// write code here
    }

    public String toString() {
       
       return "The card has a balance of " + this.balance + " " + "euros";
       
// write code here
    }

    
    
    public void eatAffordably() {

        if (this.balance >= 0 && this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }

// write code here
    }

    public void eatHeartily() {

        if (this.balance >= 0 && this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }

// write code here
    }
    
    
    
    public void addMoney(double amount) {
   
        if (amount <= 150 && amount > 0) {
            this.balance = this.balance + amount;
        }
        
        if ((this.balance + amount) > 150){
            this.balance = 150;
        }
        
        if (amount <= 0){
            this.balance = this.balance;
        }

// write code here
}
/*
    The purpose of the method is to increase the card's balance by the amount 
    of money given as a parameter. However, 
    the card's balance may not exceed 150 euros. As such, 
    if the amount to be topped up exceeds this limit, 
    the balance should, in any case, become exactly 150 euros.
    */


}
