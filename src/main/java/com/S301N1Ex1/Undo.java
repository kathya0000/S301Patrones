package com.S301N1Ex1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instancia ;
    private List<String> ordenes;
    // constructor privado para no instanciar
    private Undo() {
        ordenes = new ArrayList<>();
    }


    // Proporcionamos un método de acceso global que devuelve la única instancia.
    public static Undo getInstance() {
        if (instancia == null) {
            instancia = new Undo();
        }
        return instancia;
    }

    //  Métodos para agregar, remover y listar las órdenes.
    public void agregarOrden(String orden) {

        ordenes.add(orden);
    }

    public void removerOrden() {
        if (!ordenes.isEmpty()) {
            ordenes.remove(ordenes.size() - 1);
        }
    }

    public void listarOrdenes() {
        for (String orden : ordenes) {
            System.out.println(orden);
        }
    }
}



