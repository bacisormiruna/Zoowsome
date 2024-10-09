package factory;

import model.*;

public class InsectFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if(Constants.Animals.Insects.BUTTERFLY.equals(type)){
            return new Butterfly();
        }else if(Constants.Animals.Insects.SPIDER.equals(type)){
            return new Spider();
        }else if(Constants.Animals.Insects.ANT.equals(type)){
            return new Ant();
        }else if(Constants.Animals.Insects.BEE.equals(type)){
            return new Bee();
        }else if(Constants.Animals.Insects.COCKROACH.equals(type)){
            return new Cockroach();
        }else{
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}
