/*
The big class that will use almost every other class.
The character will be comprised of race, characterClass and other classes.
*/
package com.company;

import java.util.*;
import java.util.function.BiConsumer;

public class Character
{

    // Description
    String name;

    // TODO: race should be a class of its own
    String race;
    // TODO: the bellow variables could be put into the race class.
//    int height; // Maybe just all in inches?
//    int weight; // In pounds
//    String hairColor;
//    String eyeColor;
//    String skinColor;
    String alignment;

    // Class and level
    // TODO: characterClass could be a class of its own too
    String characterClass;
    // TODO: these variables should be put into the characterClass class
//    int level;
//    int healthPoints;
//    int proficiencyBonus;

    // Attributes
    Map<String, Integer[]> attributes = new HashMap<String, Integer[]>();

    // Skills: Strength
    int athletics;

    // Skills: Dexterity
    int acrobatics;
    int slieghtOfHand;
    int stealth;

    // Skills: Intelligence
    int arcana;
    int history;
    int investigation;
    int nature;
    int religion;

    // Skills: Wisdom
    int animalHandling;
    int insight;
    int medicine;
    int perception;
    int passivePerception;
    int survival;

    // Skills: Charisma
    int deception;
    int intimidation;
    int performance;
    int persuasion;

    // Misc: Combat
    int initiative;
    int armorClass;

    // Misc
    int inpiration;

    // TODO: Should equipment be a class of its own?

    public Character(){
        initAttributes();
        attributes.forEach((k,v) -> System.out.println(k + " = " + v[0].intValue() + ", mod = " + v[1].intValue()));
    }

    private void initAttributes(){
        Scanner attScanner = new Scanner(System.in);
        String atts[] = new String[]{"Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma"};

        for(int i = 0; i < atts.length; i++){
            System.out.print("What is your '"+ atts[i]+"' (as a number): ");
            Integer stat = 0;
            try {
                stat = attScanner.nextInt();
            }
            catch (InputMismatchException inputErr)
            {
                System.out.println("Not an integer, please try again\n");
                i--;
                continue;
            }
            catch (NoSuchElementException elementErr)
            {
                System.out.println("Input exhausted");
                System.out.println("---------- Stack Trace ----------");
                elementErr.printStackTrace();
                System.out.println("---------------------------------");
                System.exit(1);
            }
            catch (IllegalStateException stateErr)
            {
                System.out.println("Something went wrong internally, scanner not initialized");
                System.out.println("---------- Stack Trace ----------");
                stateErr.printStackTrace();
                System.out.println("---------------------------------");
                System.exit(1);
            }
            if( stat == 0)
            {
                System.out.println("Something unknown when wrong, sorry :/\n");
                System.exit(1);
            }
            Integer modifier = (stat - 10)/2;
            Integer[] value = new Integer[]{stat, modifier};

            // atts = Attribute name, value = [number, modifier]
            attributes.put(atts[i], value);
        }
    }

    private void initSkills()
    {
        // This is where the skills will get their scores based on the attributes already obtained.
    }
}
