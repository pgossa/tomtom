package pgossa.pro.tomtom.services.duck;

import pgossa.pro.tomtom.services.duck.implementations.DecoyDuck;
import pgossa.pro.tomtom.services.duck.implementations.RedHeadDuck;
import pgossa.pro.tomtom.services.duck.implementations.RubberDuck;
import pgossa.pro.tomtom.services.duck.implementations.SteamerDuck;

public class DuckService {

    public DecoyDuck decoyDuck;
    public RedHeadDuck redHeadDuck;
    public RubberDuck rubberDuck;
    public SteamerDuck steamerDuck;

    public DuckService(){
        this.decoyDuck = new DecoyDuck();
        this.redHeadDuck = new RedHeadDuck();
        this.rubberDuck = new RubberDuck();
        this.steamerDuck = new SteamerDuck();
    }
}
