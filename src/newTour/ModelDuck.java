package newTour;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior=new Quack();
    }
}
