package model;

public class Ant extends Insect{
    public Ant(){
        super(8,"Ant", false,false);
    }

    public Ant(Integer nrOflegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOflegs,name,canFly,isDangerous);
    }
}
