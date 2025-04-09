package burak;

public interface myInterface {

    public static final int number = 15;

    public default void scream(){
        System.out.println("SCREAM!");
    }

    public abstract void talk();
    public abstract void run();

}
