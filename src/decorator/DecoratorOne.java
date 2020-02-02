package decorator;

public class DecoratorOne extends Decorator {

    Base base;

    public DecoratorOne(Base base){
        this.base = base;
    }

    @Override
    public String description() {
        return base.description() + " decorator one";
    }

    @Override
    public double price() {
        return base.price() + 2;
    }
}
