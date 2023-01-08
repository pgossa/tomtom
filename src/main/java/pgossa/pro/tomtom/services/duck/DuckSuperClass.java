package pgossa.pro.tomtom.services.duck;

import pgossa.pro.tomtom.services.duck.behaviours.fly.interfaces.FlyBehaviourInterface;
import pgossa.pro.tomtom.services.duck.behaviours.quack.interfaces.QuackBehaviourInterface;

public abstract class DuckSuperClass {
    public FlyBehaviourInterface FlyBehaviour;
    public QuackBehaviourInterface QuackBehaviour;

    public String Swim(){
        return("Swimming");
    }
    public String PerformFly(){
        return FlyBehaviour.Fly();
    }
    public String PerformQuack(){
        return QuackBehaviour.Quack();
    }
    
    protected void SetFlyBehaviour(FlyBehaviourInterface fb){
        this.FlyBehaviour = fb;
    }
    protected void SetQuackBehaviour(QuackBehaviourInterface qb){
        this.QuackBehaviour = qb;
    }

}
