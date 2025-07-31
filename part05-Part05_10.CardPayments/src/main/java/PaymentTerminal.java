
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal(double money, int affordableMeals, int heartyMeals) {
        this.money = money;
        this.affordableMeals = affordableMeals;
        this.heartyMeals = heartyMeals;
    }


    public PaymentTerminal() {
        this.money = 1000; // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 2.5;
        double change = payment;

        if (payment >= 2.5) {

            change = payment - meal;
            money = money + meal;
            affordableMeals++;
        }

        return change;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        double meal = 4.3;
        double change = payment;

        if (payment >= 4.3) {

            change = payment - meal;
            money = money + meal;
            heartyMeals++;
        }

        return change;

    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double affordableMeal = 2.5;

        if (card.balance() >= affordableMeal) {
            card.takeMoney(affordableMeal);
            affordableMeals++;
            return true;

        }
        return false;

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        double heartlyMeal = 4.3;

        if (card.balance() >= heartlyMeal) {
            card.takeMoney(heartlyMeal);
            heartyMeals++;
            return true;

        }
        return false;
        
    }
public void addMoneyToCard(PaymentCard card, double sum) {
    // ...
   if (sum > 0) {
        card.addMoney(sum);
        money = money + sum;
   } else {
       money = money;
       card.addMoney(0);
   }

}

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
