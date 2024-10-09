package model;

public class Butterfish extends Aquatic{
    public Butterfish(){
        super(0,"Butterfish",1000,WaterType.SALTWATER);
    }

    public Butterfish(Integer avgSwimDepth, WaterType watertype){
        super(0,"Butterfish",avgSwimDepth,watertype);
    }
}
