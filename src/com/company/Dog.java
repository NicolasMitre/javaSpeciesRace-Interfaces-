package com.company;

public class Dog extends Species implements ISprintable {
    public Dog() {
        super();
        velocity = 10;
    }

    @Override
    public Double run(Double distance) {
        return distance / this.velocity;
    }
}
