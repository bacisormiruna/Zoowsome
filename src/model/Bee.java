package model;

public class Bee extends Insect{
    public Bee(){
        super(6,"Bee", true,true);
    }

    public Bee(Integer nrOflegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOflegs,name,canFly,isDangerous);
    }
}
