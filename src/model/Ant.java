package model;

public class Ant extends Insect{
    //in InsectFactory ca sa creez o noua instanta de obiect (specie de insecta) pot folosi atat constructorul cu parametrii cat si cel fara parametrii
    //pentru factory este specific sa folosesc constructori fara parametrii
    public Ant(){
        super(8,"Ant", false,false);
    }

    public Ant(Integer nrOflegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOflegs,name,canFly,isDangerous);
    }
}
