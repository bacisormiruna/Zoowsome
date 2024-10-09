package model;

public class Cockroach extends Insect{
    public Cockroach(){
        super(8,"Cockroach",false, false);
    }
    public Cockroach(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOfLegs,name,canFly,isDangerous);
    }
}
