package model;

public class Cat extends Mammal{
    public Cat(){
        super(4,"Cat", 30,97);
    }

    public Cat(float normalBodyTemp, float percBodyHair){
        super(4,"Cat", normalBodyTemp,percBodyHair);
    }
}
