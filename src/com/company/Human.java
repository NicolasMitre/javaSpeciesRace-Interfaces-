package com.company;

public class Human extends Species implements ISprintable{
    public Human() {
        super();
        velocity = 9;
    }

    @Override
    public Double run(Double distance) {
        return distance / this.velocity;
    }
}
