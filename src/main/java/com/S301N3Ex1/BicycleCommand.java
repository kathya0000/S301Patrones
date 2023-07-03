package com.S301N3Ex1;

public class BicycleCommand implements Command{
    private Bycycle bycycle;

    public BicycleCommand(Bycycle bycycle) {
        this.bycycle = bycycle;
    }

    @Override
    public void execute() {
        bycycle.start();
        bycycle.accelerate();
        bycycle.stop();
    }

}
