package model;

public class Monkey extends Mammal{
    public Monkey(){
        super(4,"Monkey", 21,78);
    }

    public Monkey(float normalBodyTemp, float percBodyHair){
        super(4,"Monkey",normalBodyTemp,percBodyHair);
    }
}
