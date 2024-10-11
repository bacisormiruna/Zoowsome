package model;

public class Monkey extends Mammal{
    public Monkey(){
        super(4,"Monkey", 21.3f,78.6f);
    }

    public Monkey(float normalBodyTemp, float percBodyHair){
        super(4,"Monkey",normalBodyTemp,percBodyHair);
    }
}
