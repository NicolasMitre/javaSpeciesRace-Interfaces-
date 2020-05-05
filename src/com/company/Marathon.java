package com.company;

import java.util.ArrayList;
import java.util.List;

public class Marathon {

    public static void run(Species species, Double distance){
        System.out.println("Im a " + species.getClass().getSimpleName() +" and my time was: " + species.run(distance));
    }
    public static void main(String[] args) {
        Species dog = new Dog();
        Species human = new Human();
        Species robot = new Robot();

        List<Species> runners = new ArrayList<>();

        runners.add(dog);
        runners.add(human);
        runners.add(robot);

        runners.forEach(specie -> run(specie, 150.5));
    }
}
