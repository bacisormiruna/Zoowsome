package model;

public class Eagle extends Bird{
    public Eagle(){
        super(2, "Eagle", true, 1000);
    }

    public Eagle(Boolean migrates, Integer avgFlightAltitude){
        super(2,"Eagle", migrates, avgFlightAltitude);
    }
}
