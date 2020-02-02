package visitor;

public class ThingThree extends Something {

    public ThingThree(String name) {
        super(name);
    }

    @Override
    public void remove(Visitor toBeRemoved) {
        toBeRemoved.remove(this);
    }

    @Override
    public String toString(){
        return "Thing three: " + name;
    }
}
