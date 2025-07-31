/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Timer {
    
private ClockHand seconds;
private ClockHand hundredthsOfSecond;
private ClockHand minutes;

public Timer(){
    this.seconds = new ClockHand (60);
    this.hundredthsOfSecond = new ClockHand(100); 
    this.minutes = new ClockHand (60);
}

public void advance (){
    this.hundredthsOfSecond.advance();
    if (this.hundredthsOfSecond.value() == 0){
        this.seconds.advance();
        if (this.seconds.value() == 0){
            this.minutes.advance();
        }
    }
}

    public String toString() {
        return seconds + ":" + hundredthsOfSecond;
    }



}


/*
The exercise template comes with the "ClockHand" 
class described above. Implement a Timer class based on the material's Clock class.

The timer has two hands, 
one for hundredths of a second and one for seconds. 
As it progresses, the number of hundredths of a second grows by one. 
When the hand corresponding to hundredths of a second reaches a value of 100, 
its value is set to zero, 
and the number of seconds grows by one. 
In the same way, when the value of the hand 
corresponding to seconds reaches the value of sixty, 
its value is set to zero.

public Timer() creates a new timer.
public String toString() returns a string representation of the timer. 
The string representation should be in the form "seconds: hundredths of a second",
where both the seconds and the hundredths of a second are represented by two numbers. 
For example, "19:83" would represent the time 19 seconds, 83 hundredths of a second.
public void advance() moves the timer forward by a hundredth of a second.
Once you've completed the task, return it to the server.

You can test out the timer's functionality in the main program whenever you like. 
The example code below provides you with a program where the timer is printed 
and it advances once every hundredth of a second.

Timer timer = new Timer();

while (true) {
    System.out.println(timer);
    timer.advance();

    try {
        Thread.sleep(10);
    } catch (Exception e) {

    }
}
*/