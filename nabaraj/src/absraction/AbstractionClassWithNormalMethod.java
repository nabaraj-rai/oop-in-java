package absraction;

abstract class Computer1 {
    abstract void start();
    void shutdown(){
        System.out.println("Computer is shutting down.");
    }
    
}

class Laptop1 extends Computer1{
    @Override
    void start(){
        System.out.println("Laptop Started");
    }
}

public class AbstractionClassWithNormalMethod{
    public static void main(String[] args){
        Laptop1 l = new Laptop1();
        l.start();
        l.shutdown();
    }
}
