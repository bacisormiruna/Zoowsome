package factory;

import model.Animal;

public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}
