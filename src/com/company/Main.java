package com.company;

import com.company.models.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        AnimalModel Goat = new AnimalModel("Goats",1, 4, "Paw", "Rabbit", "3 Months", "2 Months");
        AnimalModel Cow = new AnimalModel("Cows",1, 4, "Hooves", "MOOO", "3 Months", "6 Months");;
        AnimalModel Sheep = new AnimalModel("Sheep",1, 4, "Hoof", "Bleet", "3 Months", "2 Months");
        AnimalModel Rabbit = new AnimalModel("Rabbit",1, 4, "Paw", "Rabbit", "3 Months", "2 Months");
        AnimalModel Cats = new AnimalModel("Cats",1, 4, "Paw", "Meow", "2 Months", "1 Month");
        AnimalModel Pigs = new AnimalModel("Pigs",1, 4, "Hoof", "Oink Oink", "3 Months", "2 Months");

        System.out.println(Goat.toString());
        System.out.println(Cow.toString());
        System.out.println(Cow.toString());
        System.out.println(Rabbit.toString());
        System.out.println(Pigs.toString());
        System.out.println(Cats.toString());
        System.out.println(Sheep.toString());
    }
}
