package org.o7planning.tutorial.sorting;

public class ActorSortingDemo {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Mischa", "Barton");
        Actor actor2 = new Actor("Christian", "Bale");
        Actor actor3 = new Actor("Joan", "Collins");
        Actor actor4 = new Actor("Gemma", "Arton");
        Actor actor5 = new Actor("Daniel", "Craig");

        Actor[] actors = new Actor[] {actor1, actor2, actor3, actor4, actor5};
        for (int i = 0; i < actors.length; i++) {
            for(int j = i + 1; j < actors.length; j++) {
                if(actors[j].compareTo(actors[i]) < 0) {
                    Actor temp = actors[j];
                    actors[j] = actors[i];
                    actors[i] = temp;
                }
            }
        }

        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
    }
}
