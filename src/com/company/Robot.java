package com.company;

public class Robot extends Species implements ISprintable {
   public Robot() {
       super();
       velocity = 11;
   }

    @Override
    public Double run(Double distance) {
        return distance / this.velocity;
    }
}
