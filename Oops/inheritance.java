class Animal {
    public void haveEyes() {
        System.out.println("All Animals have eyes");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog is an animal - can bark and hv eyes.");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Dog mydog= new Dog();
        mydog.haveEyes();
        mydog.bark();
    }
}