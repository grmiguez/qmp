package com.grm.qmp.domain.wardrobe;

public class NoAccesoriesException extends Exception {

    public NoAccesoriesException() {
        super("No hay accesorios en el guardarropas, por lo que no se puede generar un Atuendo");
    }

}
