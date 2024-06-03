package Player;

import TypeOfCharacter.Green;
import TypeOfCharacter.Blue;
import TypeOfCharacter.Red;
import TypeOfCharacter.Yellow;

public class Player {
    String name;
    int level = 1;
    Green greenCharacter;
    Blue blueCharacter;
    Yellow yellowCharacter;
    Red redCharacter;

    public Player(){
    }

    public void levelUp(){
        this.level++;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGreenCharacter(Green greenCharacter){
        this.greenCharacter = greenCharacter;
    }

    public void setBlueCharacter(Blue blueCharacter){
        this.blueCharacter = blueCharacter;
    }

    public void setYellowCharacter(Yellow yellowCharacter){
        this.yellowCharacter = yellowCharacter;
    }

    public void setRedCharacter(Red redCharacter){
        this.redCharacter = redCharacter;
    }

    public int getLevel(){
        return this.level;
    }

    public Green getGreenCharacter(){
        return this.greenCharacter;
    }

    public Blue getBlueCharacter(){
        return this.blueCharacter;
    }

    public Yellow getYellowCharacter(){
        return this.yellowCharacter;
    }

    public Red getRedCharacter(){
        return this.redCharacter;
    }
}

