package model;

public abstract class Animal {
    private  Integer nrOfLegs;
    private String name;

    public Animal(){
        this.nrOfLegs=0;
        this.name="no name";
    }
    public Animal(Integer nrLegs, String name){
        nrOfLegs=nrLegs;
        this.name=name;
    }

    public Integer getNrOfLegs(){
        return nrOfLegs;
    }
    public String getName(){
        return name;
    }
    public void setNrOfLegs(Integer nrOfLegs){
        this.nrOfLegs=nrOfLegs;
    }
    public void setName(String name){
        this.name=name;
    }
}
