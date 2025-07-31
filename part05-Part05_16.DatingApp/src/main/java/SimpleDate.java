
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
  public void advance(){

        this.day++;

        if (this.day > 30) {
            this.day = 1;
            this.month++;

            if (this.month >= 12) {
                this.month = 1;
                this.year++;
            }
        }

    }

    
    
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }

    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, month, year);

        for (int i=0;i<days;i++){
            newDate.advance();
        }
  
    return newDate;
   
    }
    
}
/*
Advance specific number of days
Implement the method public void advance(int howManyDays)
that moves the date by the number of days that is given. 
Use the method advance() that you implemented in the previous section to help you in this.

Passing of time
Let's add the possibility to advance time to the SimpleDate class. 
Create the method public SimpleDate afterNumberOfDays(int days) 
for the class. It creates a new SimpleDate object whose date is the specified number
of days greater than the object that the method was called on. 
You may still assume that each month has 30 days. 
Notice that the old date object must remain unchanged!

Since the method must create a new object, the structure of the code should be somewhat similar to this:
*/