package decorator;

public class DecoratorTwo extends Decorator {

    Base base;

    public DecoratorTwo(Base base){
        this.base = base;
    }

    @Override
    public String description() {
        return base.description() + " decorator two";
    }

    @Override
    public double price() {
        return base.price() + 3;
    }
}
