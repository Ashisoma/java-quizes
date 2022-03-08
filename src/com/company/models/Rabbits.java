package com.company.models;

import com.company.util.Functions;

public class Rabbits extends Animals implements Functions {
    public Rabbits() {
        super(1, 4, "Paw", "Rabbit", "3 Months", "2 Months");
    }

    @Override
    public String makeASound() {
        return this.soundMade;
    }

    @Override
    public String pregnancyPeriod() {
        return this.pregnancyPeriod;
    }

    @Override
    public String lactationPeriod() {
        return this.lactatingPeriod;
    }

    @Override
    public String typeOfFeet() {
        return this.feet;
    }

    @Override
    public Integer numberOfLegs() {
        return this.legs;
    }

    @Override
    public Integer numberOfTails() {
        return this.tails;
    }

    @Override
    public String toString() {
        return "Rabbits{" +
                "tails=" + tails +
                ", legs=" + legs +
                ", feet='" + feet + '\'' +
                ", soundMade='" + soundMade + '\'' +
                ", lactatingPeriod='" + lactatingPeriod + '\'' +
                ", pregnancyPeriod='" + pregnancyPeriod + '\'' +
                '}';
    }
}
