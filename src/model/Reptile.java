package model;

public abstract class Reptile extends Animal{
    private Boolean laysEggs;

    public Reptile(){
        super(4,"No reptile name");
    }
    public Reptile(Integer nrOfLegs, String name,Boolean laysEggs){
        super(nrOfLegs,name);
        this.laysEggs=laysEggs;
    }

    public Boolean getLaysEggs(){
        return laysEggs;
    }

    public void setLaysEggs(Boolean laysEggs){
        this.laysEggs=laysEggs;
    }
}
