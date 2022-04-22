package com.grm.qmp.domain.wardrobe;

public class NoFootwearsException extends Exception {

    public NoFootwearsException() {
        super("No hay calzados en el guardarropas, por lo que no se puede generar un Atuendo");
    }

}
