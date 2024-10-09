package model;

public class Lizard extends Reptile{
    public Lizard(){
        super(4, "Lizard", true);
    }

    public Lizard(Boolean laysEggs){
        super(4, "Lizard", laysEggs);
    }
}
