package model;

public class Dog extends Mammal{
    public Dog(){
        super(4,"Dog", 29,95);
    }

    public Dog(float normalBodyTemp, float percBodyHair){
        super(4,"Dog", normalBodyTemp, percBodyHair);
    }
}
