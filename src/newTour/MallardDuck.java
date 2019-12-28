package newTour;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
//        初始化实例变量来设定鸭子行为的做法仍不够弹性，可使用setter
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a real Mallard Duck");
    }
}
