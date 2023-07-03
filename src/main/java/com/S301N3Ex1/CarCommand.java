package com.S301N3Ex1;

public class CarCommand implements Command{
    private Car car;

    public CarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
        car.accelerate();
        car.stop();
    }

}

