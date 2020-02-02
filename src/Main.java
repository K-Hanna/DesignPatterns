import factory.*;
import decorator.*;
import visitor.*;
import visitor.Something;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println("-------------------------------------");

        factory.Something something1 = Factory.getInstance();
        something1.show("Hello world!");

        factory.Something something2 = Factory.getInstance();
        something2.show("It's me.");

        System.out.println("-------------------------------------");

        Base base1 = new BaseOne();
        Base base2 = new BaseTwo();

        base1 = new DecoratorTwo(base1);
        base2 = new DecoratorTwo(new DecoratorOne(base2));

        System.out.println(base1.description() + ", " + base1.price());
        System.out.println(base2.description() + ", " + base2.price());

        System.out.println("-------------------------------------");

        List<Something> lista = new ArrayList<>();
        lista.add(new ThingOne("One"));
        lista.add(new ThingTwo("Two"));
        lista.add(new ThingThree("Three"));

        Visitor uzo = new ToDo();

        for(Something zo : lista){
            System.out.print(zo.name + " to do: ");
            zo.remove(uzo);
        }
    }
}
