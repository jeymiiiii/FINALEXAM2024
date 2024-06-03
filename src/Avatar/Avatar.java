package Avatar;

public class Avatar extends Skill {
    int strengthAttribute = 0;
    int dexterityAttribute = 0;
    int intelligenceAttribute = 0;
    int StaminaAttribute = 0;
    public int lifePoints = 0;

    public Avatar(int strengthAttribute,
              int dexterityAttribute,
              int intelligenceAttribute,
              int StaminaAttribute,
              int lifePoints,
              int extraDamagePoints,
              String skillName)
    {
        this.strengthAttribute = strengthAttribute;
        this.dexterityAttribute = dexterityAttribute;
        this.intelligenceAttribute = intelligenceAttribute;
        this.StaminaAttribute = StaminaAttribute;
        this.lifePoints = lifePoints;
        this.extraDamagePoints = extraDamagePoints;
        this.skillName = skillName;
    }
}
