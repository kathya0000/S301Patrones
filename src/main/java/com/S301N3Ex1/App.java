package com.S301N3Ex1;

public class App {
    public static void main(String[] args) {
        // Crear vehículos
        Car car = new Car();
        Boat boat = new Boat();
        Bycycle bycycle = new Bycycle();
        Airplane airplane=new Airplane();

        // Crear comandos para los vehículos
        Command carCommand = new CarCommand(car);
        Command boatCommand = new BoatCommand(boat);
        Command bycycleCommand = new BicycleCommand(bycycle);
        Command airplaneCommand = new AirplaneCommand(airplane);

        // Ejecutar los comandos
        carCommand.execute();  // Esto arranca, acelera y frena el coche
        boatCommand.execute(); // Esto arranca, acelera y frena el barco
        bycycleCommand.execute();// esto arranca, acelera y frena la bycycleta
        airplaneCommand.execute();// Esto arranca, acelera y frena el avion
    }
}
