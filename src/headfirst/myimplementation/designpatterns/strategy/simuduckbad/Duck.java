package headfirst.myimplementation.designpatterns.strategy.simuduckbad;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void fly() {
        System.out.println("I am flying");
    }

    public abstract void display();
}
