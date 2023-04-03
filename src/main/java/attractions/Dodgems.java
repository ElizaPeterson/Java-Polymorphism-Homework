package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed {

    double price = 4.50;
    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double halfPriceFor(Visitor visitor){
        if (visitor.getAge() <= 12){
            return price / 2;
        }
        return price;
    }
}
