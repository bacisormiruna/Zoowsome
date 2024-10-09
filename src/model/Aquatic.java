package model;

public abstract class Aquatic extends Animal {
    private Integer avgSwimDepth;
    private WaterType waterType;

    public Aquatic(){
        super(0,"No aquatic name");
    }
    public Aquatic( Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType watertype){
        super(nrOfLegs, name);
        this.avgSwimDepth=avgSwimDepth;
        this.waterType=waterType;
    }

    public Integer getAvgSwimDepth(){
        return avgSwimDepth;
    }

    public WaterType getWaterType(){
        return waterType;
    }

    public void setAvgSwimDepth(Integer avgSwimDepth){
        this.avgSwimDepth=avgSwimDepth;
    }

    public void setWaterType(WaterType waterType){
        this.waterType=waterType;
    }
}