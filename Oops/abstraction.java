import java.io.*;
abstract class Animal{
    abstract void run();
}
class Dog extends Animal{
    void run(){

        System.out.println("abstract class example ");
    }
}
public class abstraction{

    public static void main(String[] args) {
        Animal abs = new Dog();
        abs.run();
    }
}