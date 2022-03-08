package com.company;

import com.company.models.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        A farmer kept sheep, pigs, goats, cows, and rabbits in his farm.
        He also had pets like dogs and cats.
        xtics
        number of tails and legs
        functions
        animals had different sounds (or made different sounds), pregnancy periods and lactation periods

         this in its implementation (e.g give the name of each animal’s feet).
         */
        Dogs g = new Dogs();
        Cats c = new Cats();
        Sheep s = new Sheep();
        Pigs p = new Pigs();
        Goats gts = new Goats();
        Cows cs = new Cows();
        Rabbits r = new Rabbits();

        System.out.println(c.toString());
        System.out.println(g.toString());
        System.out.println(p.toString());
        System.out.println(gts.toString());
        System.out.println(cs.toString());
        System.out.println(s.toString());
        System.out.println(r.toString());
    }
}
