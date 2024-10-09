package model;

public class Turtle extends Reptile{
    public Turtle(){
        super(4, "Turtle",true);
    }
    public Turtle(String name, Boolean laysEggs){
        super(4, name,laysEggs);
    }
}
