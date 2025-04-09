package Zoo;

public abstract class fishAbstractClass {

    public String name;
    public String fishType;
    protected static int fishCounter = 0;

    public void introduction(){
        System.out.println("Hello, my name is " + name + " and I am a " + fishType + " fish :)");
    }

    public static int numberOfFish(){
        return fishCounter;
    };

}
