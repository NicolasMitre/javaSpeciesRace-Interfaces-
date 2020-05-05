package com.company;

public class Species implements ISprintable{
    public Species() {
        this.velocity = 0;
    }

    protected Integer velocity;

    @Override
    public Double run(Double distance) {
        return distance / this.velocity;
    }
}
