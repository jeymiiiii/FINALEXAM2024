package TypeOfCharacter;

import Avatar.Avatar;

public class Yellow {
    String characterName;
    Avatar character;
    public Yellow(String characterName) {
        this.characterName = characterName;
        character = new Avatar(5,
                4,
                3,
                10,
                100,
                1,
                "Electric Slingshot");
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
