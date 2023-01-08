package pgossa.pro.tomtom.services.duck.implementations;

import pgossa.pro.tomtom.services.duck.DuckSuperClass;
import pgossa.pro.tomtom.services.duck.behaviours.fly.FlyNoWayBehaviour;
import pgossa.pro.tomtom.services.duck.behaviours.quack.QuackBehaviour;

public class RubberDuck extends DuckSuperClass{

    public RubberDuck(){
        FlyBehaviour = new FlyNoWayBehaviour();
        QuackBehaviour = new QuackBehaviour();
    }
    
}
