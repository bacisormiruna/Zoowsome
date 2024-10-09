package controller;

import factory.AnimalFactory;
import factory.Constants;
import factory.SpeciesFactory;
import model.*;

public class Main {
    //public static void main(String[] args){
    //  System.out.println("Hello World!");
    //}
    public static void main(String[] args) {
        AnimalFactory abstractFactory = new AnimalFactory();
        SpeciesFactory mamalSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        SpeciesFactory birdSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
        SpeciesFactory insectSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
        SpeciesFactory aquaticSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
        SpeciesFactory reptileSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);

        Animal lorenzoTheCat = mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.CAT);
        System.out.printf("We have an animal with %d legs! It's name is Lorenzo.\n", lorenzoTheCat.getNrOfLegs());
        System.out.println();

        Animal marioTheParrot = birdSpeciesFactory.getAnimal(Constants.Animals.Birds.PARROT);
        // Ca sa accesez metoda specifica trebuie sa fac cast
        if (marioTheParrot instanceof Bird) {
            Bird bird = (Bird) marioTheParrot;
            System.out.printf("We have a colored bird that has the average flight altitude equal to %d!\n", bird.getAvgFlightAltitude());
        }
        System.out.println();

        Animal bettyTheAnt=insectSpeciesFactory.getAnimal(Constants.Animals.Insects.ANT);
        bettyTheAnt.setName("Betty");
        if (bettyTheAnt instanceof Insect) {
            Insect insect = (Insect) bettyTheAnt;
            System.out.printf("We have an ant named %s with %d legs.\n",insect.getName(), insect.getNrOfLegs());
            System.out.printf("Is the ant dangerous? %s\n", insect.getDangerous()? "Yes":"No");
            System.out.printf("Can Betty fly? %s\n", insect.getCanFly()? "Yes":"No");
        }
        System.out.println();

        Animal tedTheShark=aquaticSpeciesFactory.getAnimal(Constants.Animals.Aquatics.SHARK);
        tedTheShark.setName("Ted");
        if (tedTheShark instanceof Aquatic) {
            Aquatic shark = (Shark) tedTheShark;
            shark.setWaterType(WaterType.SALTWATER);
            shark.setAvgSwimDepth(2000);
            System.out.printf("We have a shark called %s.\n",tedTheShark.getName());
            System.out.printf("%s swims in %s water at an average depth of %d meters.\n",tedTheShark.getName(),shark.getWaterType()==WaterType.SALTWATER ? "saltwater" : "softwater", shark.getAvgSwimDepth());
        }
        System.out.println();
        Animal mimiTheTurtle=reptileSpeciesFactory.getAnimal(Constants.Animals.Reptiles.TURTLE);
        mimiTheTurtle.setName("Mimi");
        if (mimiTheTurtle instanceof Reptile) {
            Reptile turtle=(Reptile) mimiTheTurtle;
            System.out.printf("We have a turtle named %s.\n",mimiTheTurtle.getName());
            System.out.printf("Does %s lay eggs? %s\n",mimiTheTurtle.getName(), turtle.getLaysEggs()? "Yes":"No");
        }
    }
}