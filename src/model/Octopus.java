package model;

public class Octopus extends Aquatic{
    public Octopus(){
        super(8,"Octopus", 500, WaterType.SOFTWATER);
    }

    public Octopus(Integer avgSwimDepth, WaterType watertype){
        super(8, "Octopus", avgSwimDepth,watertype);
    }
}
