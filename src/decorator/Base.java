package decorator;

public abstract class Base {

    //basic object
    protected String name = "Base";

    public String description(){
        return name;
    }

    public abstract double price();
}
