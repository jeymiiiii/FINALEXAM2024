package TypeOfCharacter;

import Avatar.Avatar;

public class Green {
    String characterName;
    Avatar character;
    public Green(String characterName){
       this.characterName = characterName;
        character = new Avatar(3,
                2,
                5,
                10,
                100,
                1,
                "Danger Senses");
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getLifePoints() {
        return character.lifePoints;
    }

    public void setWinner() {
        character.lifePoints = character.lifePoints / 2;
    }

    public void setLoser() {
        character.lifePoints = 0;
    }
}
