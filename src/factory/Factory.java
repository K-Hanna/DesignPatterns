package factory;

public class Factory {

    public static Something getInstance(){
        return new SomethingOne(); //place to change somethings
    }
}
