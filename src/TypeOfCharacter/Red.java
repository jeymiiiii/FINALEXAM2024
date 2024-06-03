package TypeOfCharacter;

import Avatar.Avatar;

public class Red {
    String characterName;
    Avatar character;
    public Red(String characterName) {
        this.characterName = characterName;
        character = new Avatar(4,
                5,
                2,
                10,
                100,
                1,
                "Magma morphing");
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