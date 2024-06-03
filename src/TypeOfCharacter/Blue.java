package TypeOfCharacter;

import Avatar.Avatar;

public class Blue{
    String characterName;
    Avatar character;
    public Blue(String characterName) {
        this.characterName = characterName;
        character = new Avatar(2,
                4,
                3,
                10,
                100,
                1,
                "Flight");
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
