
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            this.value = this.value + 0;
        } else {

            this.value = this.value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            this.value = this.value + 0;
        } else {

            this.value = this.value - decreaseBy;
        }
    }




}
/*
Implement versions which are given one parameter of the methods increase and decrease.

public void increase(int increaseBy) 
increases the value of the counter by the value of increaseBy. If the value of increaseBy is negative, the value of the counter does not change.
public void decrease(int decreaseBy) 
decreases the value of the counter by the value of decreaseBy. If the value of decreaseBy is negative, the value of the counter does not change.
*/