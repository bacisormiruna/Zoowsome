package model;

public abstract class Bird extends Animal{
    private Boolean migrates;
    private Integer avgFlightAltitude;
    public Bird(){
        super(2, "No bird name");
        this.migrates=false;
        this.avgFlightAltitude=600;
    }
    public Bird(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name);
        this.migrates=migrates;
        this.avgFlightAltitude=avgFlightAltitude;
    }
    public Boolean getMigrates(){
        return migrates;
    }

    public Integer getAvgFlightAltitude(){
        return avgFlightAltitude;
    }

    public void setMigrates(Boolean migrates){
        this.migrates=migrates;
    }

    public void setAvgFlightAltitude(Integer avgFlightAltitude){
        this.avgFlightAltitude=avgFlightAltitude;
    }
}
