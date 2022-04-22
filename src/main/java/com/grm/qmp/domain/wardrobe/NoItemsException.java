package com.grm.qmp.domain.wardrobe;

public class NoItemsException extends Exception {

    public NoItemsException() {
        super("No hay prendas suficientes en el guardarropas para poder generar un atuendo");
    }

}
