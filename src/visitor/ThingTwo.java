package visitor;

public class ThingTwo extends Something {

    public ThingTwo(String name){
        super(name);
    }

    @Override
    public void remove(Visitor toBeRemoved) {
        toBeRemoved.remove(this);
    }

    @Override
    public String toString(){
        return "Thing two: " + name;
    }
}
