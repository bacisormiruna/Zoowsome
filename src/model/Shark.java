package model;

public class Shark extends Aquatic{
    public Shark(){
        super(0,"Shark", 1500, WaterType.SALTWATER);
    }
    public Shark(Integer avgSwimDepth, WaterType watertype){
        super(0,"Shark", avgSwimDepth,watertype);
    }
}
