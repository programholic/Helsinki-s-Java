/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Song {
    
    // variables
    private String name;
    private int length;
    
    
    //constructor
    public Song (String name, int length){
        this.name = name;
        this.length = length;
    }
    
    //methods
    // 1. method name()
   
    public String name (){
        return this.name;
    }

    //2. method length()
    public int length(){
        return this.length;
    }





}



/*
Create a class called Song. The song has the instance variables name (string) and length in seconds (integer). 
Both are set in the public Song(String name, int length) constructor. 
Also, add to the object the methods public String name(), 
which returns the name of the song, and public int length(), which returns the length of the song.


The class should work as follows.

Song garden = new Song("In The Garden", 10910);
System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");

The song In The Garden has a length of 10910 seconds.

*/