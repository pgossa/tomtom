package pgossa.pro.tomtom.services.duck.implementations;

import pgossa.pro.tomtom.services.duck.DuckSuperClass;
import pgossa.pro.tomtom.services.duck.behaviours.fly.FlyWithWingsBehaviour;
import pgossa.pro.tomtom.services.duck.behaviours.quack.QuackBehaviour;

public class RedHeadDuck extends DuckSuperClass {
    public RedHeadDuck(){
        FlyBehaviour = new FlyWithWingsBehaviour();
        QuackBehaviour = new QuackBehaviour();
    }
}
