package com.company.models;

public abstract class Animals {
    Integer tails;
    Integer legs;
    String feet;
    String soundMade;
    String lactatingPeriod;
    String pregnancyPeriod;

    public Animals(Integer tails, Integer legs, String feet, String soundMade, String lactatingPeriod, String pregnancyPeriod) {
        this.tails = tails;
        this.legs = legs;
        this.feet = feet;
        this.soundMade = soundMade;
        this.lactatingPeriod = lactatingPeriod;
        this.pregnancyPeriod = pregnancyPeriod;
    }
}
