package com.company;

import java.util.Random;

// TODO| should this be a parent class for sub class that are the different game classes?
// TODO| EX: Warlock, fighter, bard, etc

public class CharacterClass
{
    // If a d6, then hitDieType will be 6. A d8 will be 8 and so on.
    int hitDieType;
    // the HP stat, grows with levels
    // Rand number from [1, hitDieType] + the Characters constitution.
    int health;
    int level;
    int proficiencyBonus;

    // TODO| should this be were the attribute saves are stored?
    // TODO| The class determines the preferred saves of the character.

    // Every class has 2 saving throws
    String[] savingThrows = new String[2];

    // Most classes get to choose anywhere from 2 - 4 different skills that they want to be proficient in
    String[] preferredSkills = new String[]{};

    // Con comes from the characters constitution modifier
    public CharacterClass(int con, int lvl)
    {
        // Build health based on hitDieType + con,
        if( lvl <= 1 )
        {
            health = hitDieType + con;
            level = 1;
        }
        else
        {
            Random rand = new Random(System.currentTimeMillis());
            health = hitDieType;
            for(int i = 0; i < lvl; i++)
            {
                // "Dice roll" for the amount of health that the character would have at their level.
                int next = rand.nextInt(hitDieType+1);
                if( next > 0 )
                {
                    health += next + con;
                }
                else
                {
                    i--;
                }
            }
        }
    }

    private void levelUp()
    {
        // Increase stats or add new abilities as need
    }
}
