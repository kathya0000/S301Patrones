package com.S301N1Ex1;

public class App {
    public static void main(String[] args) {

        Undo undo = Undo.getInstance();

        // Se agregan algunas órdenes.
        undo.agregarOrden("Orden 1");
        undo.agregarOrden("Orden 2");
        undo.agregarOrden("Orden 3");

        // muestran todas las órdenes.
        undo.listarOrdenes();

        //  remueve la última orden.
        undo.removerOrden();

        // muestran las órdenes después de haber eliminado una.
        undo.listarOrdenes();
    }


}

