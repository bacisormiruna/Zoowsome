package factory;

import model.*;

import java.util.NoSuchElementException;


public class BirdFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if(Constants.Animals.Birds.EAGLE.equals(type)){
            return new Eagle();
        }else if(Constants.Animals.Birds.OWL.equals(type)){
            return new Owl();
        }else if(Constants.Animals.Birds.STORK.equals(type)){
            return new Stork();
        }else if(Constants.Animals.Birds.PARROT.equals(type)){
            return new Parrot();
        }else{
            throw new NoSuchElementException("Invalid animal exception!");
        }
    }
}
