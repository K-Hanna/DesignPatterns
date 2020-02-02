package visitor;

public class ThingOne extends Something {

    public ThingOne(String name) {
        super(name);
    }

    @Override
    public void remove(Visitor toBeRemoved) {
        toBeRemoved.remove(this);
    }
    @Override
    public String toString(){
        return "Thing One: " + name;
    }
}
