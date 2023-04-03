package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {

    double price = 8.40;
    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }

    public double doubleDefaultPrice() {
        return 0;
    }

    public double doublePriceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200){
            return price * 2;
        }
        return price;
    }
}
