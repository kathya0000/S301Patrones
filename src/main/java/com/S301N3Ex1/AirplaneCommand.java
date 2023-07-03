package com.S301N3Ex1;

public class AirplaneCommand implements Command {
    private Airplane airplane;

    public AirplaneCommand(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void execute() {
       airplane.start();
       airplane.accelerate();
       airplane.stop();
    }

}
