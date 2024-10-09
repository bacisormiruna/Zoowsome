package model;

public class Snake extends Reptile{
    public Snake(){
        super(0, "Snake", true);
    }

    public Snake(String name, Boolean laysEggs){
        super(0, name, laysEggs);
    }
}
