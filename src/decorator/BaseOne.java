package decorator;

public class BaseOne extends Base {

    public BaseOne(){
        name = name + " one";
    }

    @Override
    public double price() {
        return 9;
    }
}
