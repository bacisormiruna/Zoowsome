package model;

public class Spider extends Insect{
    public Spider(){
        super(8,"Spider", false, true);
    }

    public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }
}
