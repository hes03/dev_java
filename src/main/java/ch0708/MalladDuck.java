package ch0708;
//날 수 있다. - FlyWithWing.java
//날지 못한다. - FlyNoWay.java
public class MalladDuck extends Duck{
    public MalladDuck(){
        //여기에 flybehavior 변수를 선언하지 않았는데 어떻게 에러가 안나지?
        //
        flyBehavior = new FlyWithWing();
    }
    @Override
    public void fly() {
        flyBehavior.fly(); //나는 날고 있어요
    }

    @Override
    public void display() {
        System.out.println("나는 청둥오리 입니다.");
    }
}
