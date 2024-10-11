package factory;

import model.*;

import java.util.NoSuchElementException;

public class ReptileFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if(Constants.Animals.Reptiles.ALLIGATOR.equals(type)){
            return new Alligator();
        }else if(Constants.Animals.Reptiles.TURTLE.equals(type)){
            return new Turtle();
        }else if(Constants.Animals.Reptiles.SNAKE.equals(type)){
            return new Snake();
        }else if(Constants.Animals.Reptiles.LIZARD.equals(type)){
            return new Lizard();
        }else{
            throw new NoSuchElementException("Invalid animal exception!");
        }
    }
}
