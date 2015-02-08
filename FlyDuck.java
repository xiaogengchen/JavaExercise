/**
 * Created by Administrator on 2015/2/8 0008.
 */
public class FlyDuck extends Duck{
    public FlyDuck(){
       this.flyBehavior = new FlyWithWings() ;
       this.quackBehavior = new GuaGua() ;
    }
}
