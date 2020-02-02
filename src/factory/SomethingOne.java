package factory;

public class SomethingOne implements Something {

    @Override
    public void show(String something){
        System.out.println("I'm from a factory 1: " + something);
    }
}
