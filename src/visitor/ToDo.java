package visitor;

public class ToDo implements Visitor {

    @Override
    public void remove(ThingThree thingThree) {
        System.out.println("A visitor for thing 3.");
    }

    @Override
    public void remove(ThingTwo thingTwo) {
        System.out.println("A visitor for thing 2.");
    }

    @Override
    public void remove(ThingOne thingOne) {
        System.out.println("A visitor for thing 1.");
    }
}
