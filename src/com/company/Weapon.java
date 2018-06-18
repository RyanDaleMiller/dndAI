package com.company;

public class Weapon extends Item
{

    // Simple, martial, special, etc
    String weaponType;

    int damage; // put it as a dice max?
    // b: bludgeoning, p: piercing, s: slashing,
    char damageType;

    // Properties
    boolean finesse;
    boolean light;
    boolean heavy;

    boolean thrown;
    int thrownRangeMin;
    int thrownRangeMax;

    boolean versatile;
    int versatileDmg;

    boolean range;
    int rangeMin;
    int rangeMax;

    boolean twoHanded;
    boolean reach;
    boolean Special;
    String specialRule;

    boolean loading;
    boolean ammunition;

}
