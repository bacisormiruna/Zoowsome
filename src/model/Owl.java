package model;

public class Owl extends Bird{
    public Owl(){
        super(2,"Owl",false, 300);
    }

    public Owl(Boolean migrates, Integer avgFlightAltitude){
        super(2, "Owl", migrates,avgFlightAltitude);
    }
}
