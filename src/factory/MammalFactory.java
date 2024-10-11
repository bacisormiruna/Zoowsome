package factory;

import model.*;

import java.util.NoSuchElementException;

import static factory.Constants.Animals.Mammals.CAT;
import static factory.Constants.Animals.Mammals.DOG;

public class MammalFactory extends SpeciesFactory {
    public Animal getAnimal(String type){
        if(Constants.Animals.Mammals.MONKEY.equals(type)){
            return new Monkey();
        }else if(Constants.Animals.Mammals.TIGER.equals(type)){
            return new Tiger();
        }else if(Constants.Animals.Mammals.CAT.equals(type)){
            return new Cat();
        }else if(Constants.Animals.Mammals.DOG.equals(type)){
            return new Dog();
        }else if(Constants.Animals.Mammals.COW.equals(type)){
            return new Cow();
        }
        else{
            throw new NoSuchElementException("Invalid animal exception!");
        }

    }
}
