package com.grm.qmp.domain.wardrobe;

public class Outfit {
    private final Item accessory;
    private final Item upperClothing;
    private final Item lowerClothing;
    private final Item footWear;

    // TODO: ocultar este constructor? -> no valida que el accessory sea accessory,
    // etc
    public Outfit(Item accessory, Item upperClothing, Item lowerClothing, Item footWear) {
        this.accessory = accessory;
        this.upperClothing = upperClothing;
        this.lowerClothing = lowerClothing;
        this.footWear = footWear;
    }

    // Crea outfits que no tengan accesorio
    public Outfit(Item upperClothing, Item lowerClothing, Item footWear) {
        this.accessory = null;
        this.upperClothing = upperClothing;
        this.lowerClothing = lowerClothing;
        this.footWear = footWear;
    }

    public Item accesory() {
        return this.accessory;
    }

    public Item upperClothing() {
        return this.upperClothing;
    }

    public Item lowerClothing() {
        return this.lowerClothing;
    }

    public Item footWear() {
        return this.footWear;
    }
}
