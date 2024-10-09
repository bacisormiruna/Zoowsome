package model;

public class Stork extends Bird {
    public Stork(){
        super(2, "Stork", true, 500);
    }

    public Stork(Boolean migrates, Integer avgFlightAltitude){
       super(2, "Stork", migrates, avgFlightAltitude);
    }

}
