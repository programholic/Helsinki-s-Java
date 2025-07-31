/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Cube {
    private int edge;


public Cube (int edgeLength){
    this.edge = edgeLength;
}
public int volume (){
    return this.edge * this.edge * this.edge;
}

public String toString(){
    return "The length of the edge is " + this.edge + "and the volume " + volume (); 
}


}
/*
Create a Cube class that represents a cube (i.e., a standard hexahedron). 
Create a public Cube (int edgeLength) constructor for the class, 
that takes the length of the cube's edge as its parameter.

Make a public int volume() method for the cube, 
which calculates and returns the cube's volume. 
The volume of the cube is calculated with 
the formula edgeLength * edgeLength * edgeLength. 
Moreover, make a public String toString() method for the cube, 
which returns a string representation of it. 
The string representation should take the form 
"The length of the edge is l and the volume v", 
where l is the length and v the volume - 
both the length and volume must be represented as integers.

Examples are provided underneath

Cube oSheaJackson = new Cube(4);
System.out.println(oSheaJackson.volume());
System.out.println(oSheaJackson);

System.out.println();

Cube salt = new Cube(2);
System.out.println(salt.volume());
System.out.println(salt);
*/