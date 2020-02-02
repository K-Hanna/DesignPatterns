package visitor;

public abstract class Something {

    public String name;

    public Something(String name){
        this.name = name;
    }

    public abstract void remove(Visitor toBeRemoved);

}
