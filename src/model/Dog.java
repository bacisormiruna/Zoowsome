package model;

public class Dog extends Mammal{
    public Dog(){
        super(4,"Dog", 29f,95.2f);
    }

    public Dog(String name,float normalBodyTemp, float percBodyHair){
        super(4,name, normalBodyTemp, percBodyHair);
    }
}
