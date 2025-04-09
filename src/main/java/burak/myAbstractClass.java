package burak;

public abstract class myAbstractClass extends myAbstractClass2 implements myInterface2{

    @Override
    public void run() {
        System.out.println("i am running");
    }

    @Override
    public void talk() {
        System.out.println("i am talking");
    }
}
