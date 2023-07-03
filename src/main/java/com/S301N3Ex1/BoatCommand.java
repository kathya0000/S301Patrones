package com.S301N3Ex1;

public class BoatCommand implements Command{
    private Boat boat;

    public BoatCommand(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void execute() {
        boat.start();
        boat.accelerate();
        boat.stop();
    }
}
