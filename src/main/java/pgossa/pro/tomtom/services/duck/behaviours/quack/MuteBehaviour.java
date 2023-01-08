package pgossa.pro.tomtom.services.duck.behaviours.quack;

import pgossa.pro.tomtom.services.duck.behaviours.quack.interfaces.QuackBehaviourInterface;

public class MuteBehaviour implements QuackBehaviourInterface {
    public String Quack(){
        return("Silence...");
    }
}
