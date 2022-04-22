package com.grm.qmp.domain.wardrobe;

public class NoUpperClothingsException extends Exception {

    public NoUpperClothingsException() {
        super("No hay prendas superiores en el guardarropas, por lo que no se puede generar un Atuendo");
    }

}
