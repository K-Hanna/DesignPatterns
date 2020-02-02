package decorator;

public class BaseTwo extends Base {

    public BaseTwo(){
        name = name + " two";
    }

    @Override
    public double price() {
        return 7;
    }
}
