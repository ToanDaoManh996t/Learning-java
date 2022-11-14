package org.o7planning.tutorial.sorting;

import java.util.Arrays;

public class ActorSortingDemo2 {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Mischa", "Barton");
        Actor actor2 = new Actor("Christian", "Bale");
        Actor actor3 = new Actor("Joan", "Collins");
        Actor actor4 = new Actor("Gemma", "Arton");
        Actor actor5 = new Actor("Daniel", "Craig");

        Actor[] actors = new Actor[] {actor1, actor2, actor3, actor4, actor5};
        Arrays.sort(actors);
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
    }
}
