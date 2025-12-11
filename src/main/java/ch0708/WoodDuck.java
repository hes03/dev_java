package ch0708;

public class WoodDuck extends Duck{
    public WoodDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    @Override
    public void display() {
        System.out.println("나는 나무오리입니다.");
    }

}
