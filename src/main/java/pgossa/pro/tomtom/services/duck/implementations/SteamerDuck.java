package pgossa.pro.tomtom.services.duck.implementations;

import pgossa.pro.tomtom.services.duck.DuckSuperClass;
import pgossa.pro.tomtom.services.duck.behaviours.fly.FlyWithWingsBehaviour;
import pgossa.pro.tomtom.services.duck.behaviours.quack.SqueakBehaviour;

public class SteamerDuck extends DuckSuperClass {

    public SteamerDuck(){
        FlyBehaviour = new FlyWithWingsBehaviour();
        QuackBehaviour = new SqueakBehaviour();
    }
    
}
