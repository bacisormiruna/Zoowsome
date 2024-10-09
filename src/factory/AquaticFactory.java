package factory;

import model.Animal;
import model.Butterfish;
import model.Octopus;
import model.Shark;

public class AquaticFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type){
        if(Constants.Animals.Aquatics.SHARK.equals(type)){
            return new Shark();
        }else if(Constants.Animals.Aquatics.OCTOPUS.equals(type)){
            return new Octopus();
        }else if(Constants.Animals.Aquatics.BUTTERFISH.equals(type)){
            return new Butterfish();
        }else{
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}
