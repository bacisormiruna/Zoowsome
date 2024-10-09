package model;

public class Parrot extends Bird{
    public Parrot(){
        super(2, "Parrot", false, 100);
    }

    public Parrot(String name,Boolean migrates, Integer avgFlightAltitude){
        super(2,name, migrates, avgFlightAltitude);
    }
}
