public class Singleton {

    private static Singleton singleton;

    private Singleton(){
        System.out.println("I'm a singleton.");
    }

    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }
}
