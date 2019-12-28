package newTour;

public abstract class Duck {
//    每个鸭子变量将在运行时引用正确的行为类型
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

//    鸭子对象b不亲自处理呱呱叫的行为，而是委托给quackBehavior引用的对象
    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void display();

    public void performSwing(){
        System.out.println("All ducks float, even decoys!");
    }

//    使用setter来设定鸭子的行为，而不是实例化，这样可以动态的改变鸭子的行为（调用setter）
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
