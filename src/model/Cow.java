package model;

public class Cow extends Mammal{
    public Cow(){
        super(4,"Cow", 28,60);
    }

    public Cow(float normalBodyTemp, float percBodyHair){
        super(4,"Cow", normalBodyTemp,percBodyHair);
    }
}
