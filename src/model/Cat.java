package model;

public class Cat extends Mammal{
    public Cat(){
        super(4,"Cat", 30.5f,97.5f);
    }

    public Cat(float normalBodyTemp, float percBodyHair){
        super(4,"Cat", normalBodyTemp,percBodyHair);
    }
}
