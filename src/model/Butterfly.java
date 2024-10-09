package model;

public class Butterfly extends Insect{
    public Butterfly(){
        super(6,"Butterfly", true,false);
    }

    public Butterfly(Integer nrOflegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOflegs,name,canFly,isDangerous);
    }
}
