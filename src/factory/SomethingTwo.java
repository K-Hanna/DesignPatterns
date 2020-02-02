package factory;

public class SomethingTwo implements Something {

    @Override
    public void show(String something){
        System.out.println("I'm from a factory 2: " + something);
    }
}
