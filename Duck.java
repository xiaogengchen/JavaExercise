/**
 * Created by Administrator on 2015/2/8 0008.
 */
public abstract class Duck {
    FlyBehavior flyBehavior ;
    QuackBehavior quackBehavior ;
    public void performFly(){
        flyBehavior.fly() ;
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior ;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior ;
    }
}
