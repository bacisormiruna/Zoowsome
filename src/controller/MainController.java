package controller;

import factory.AnimalFactory;
import factory.Constants;
import factory.SpeciesFactory;
import model.*;

public class Main {
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
            Bird parrot = (Bird) marioTheParrot;
            System.out.printf("We have a colored bird that has the average flight altitude equal to %d!\n", parrot.getAvgFlightAltitude());
        }
        System.out.println();

        Animal bettyTheAnt=insectSpeciesFactory.getAnimal(Constants.Animals.Insects.ANT);
        bettyTheAnt.setName("Betty");
        if (bettyTheAnt instanceof Insect) {
            Insect ant = (Insect) bettyTheAnt;
            System.out.printf("We have an ant named %s with %d legs.\n",ant.getName(), ant.getNrOfLegs());
            if (ant.getDangerous()){
                System.out.printf("Is the ant dangerous? YES \n");
            }
            else{
                System.out.printf("Is the ant dangerous? NO \n");
            }

            if (ant.getCanFly()){
                System.out.printf("Can Betty fly? YES \n");
            }
            else{
                System.out.printf("Can Betty fly? NO \n");
            }
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
            System.out.printf("Does %s lay eggs? %s\n",mimiTheTurtle.getName(), turtle.getLaysEggs()? "YES":"NO");
        }
        System.out.println();

        Animal thorTheDog = mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.DOG);
        thorTheDog.setName("Thor");
        if(thorTheDog instanceof Mammal) {
            Mammal dog = (Mammal) thorTheDog;
            dog.setPercBodyHair(97f);
            System.out.printf("We also have a friendly dog named %s.\n",thorTheDog.getName());
            System.out.printf("It has a normal body temperature equal to %.1f(C) and a body hair percent equal to %.1f%%.",dog.getNormalBodyTemp(), dog.getPercBodyHair());
        }
    }
}