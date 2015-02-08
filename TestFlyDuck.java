/**
 * Created by Administrator on 2015/2/8 0008.
 */
public class TestFlyDuck {
    public static void main(String[] args){
        Duck duck = new FlyDuck();
        duck.performFly();
        duck.performQuack();
        System.out.println("---------------") ;
        duck.setFlyBehavior(new FlyNoWings());
        duck.setQuackBehavior(new ZhiZhi());
        duck.performFly();
        duck.performQuack();
    }
}
