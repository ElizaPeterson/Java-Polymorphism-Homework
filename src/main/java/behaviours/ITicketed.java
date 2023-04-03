package behaviours;

import people.Visitor;

public interface ITicketed {
    public double doubleDefaultPrice();
    public double doublePriceFor(Visitor visitor);
}
