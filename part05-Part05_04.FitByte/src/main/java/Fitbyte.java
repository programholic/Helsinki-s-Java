/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Fitbyte {
   
    private int age;
    private int restHeartRate;
    
    public Fitbyte (int age, int restingHeartRate){
       this.age = age;
       this.restHeartRate = restingHeartRate;
   }
    
    public double maximumHeartRate (){
        return (double) (206.3 - (0.711 * this.age));
    }
    
    public double targetHeartRate (double percentageOfMaximum){
        return (double) (maximumHeartRate() - this.restHeartRate) * percentageOfMaximum + this.restHeartRate;
    }
}
