package com.grm.qmp.domain.wardrobe;

public class NoLowerClothingsException extends Exception {

    public NoLowerClothingsException() {
        super("No hay prendas inferiores en el guardarropas, por lo que no se puede generar un Atuendo");
    }

}
