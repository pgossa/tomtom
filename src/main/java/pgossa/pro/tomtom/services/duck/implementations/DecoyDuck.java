package pgossa.pro.tomtom.services.duck.implementations;

import pgossa.pro.tomtom.services.duck.DuckSuperClass;
import pgossa.pro.tomtom.services.duck.behaviours.fly.FlyNoWayBehaviour;
import pgossa.pro.tomtom.services.duck.behaviours.quack.MuteBehaviour;

public class DecoyDuck extends DuckSuperClass{
    public DecoyDuck(){
        FlyBehaviour = new FlyNoWayBehaviour();
        QuackBehaviour = new MuteBehaviour();
    }
}
