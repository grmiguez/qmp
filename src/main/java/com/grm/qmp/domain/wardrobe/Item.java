package com.grm.qmp.domain.wardrobe;

public class Item implements Wearable {

    private final ItemType type;

    // TODO: esta bien que todo esto sea string?
    private final String name;
    private final String fabric;
    private final String color; // TODO: enum? hay alguna clasae mejor para esto?
    private final String secondaryColor;

    public Item(ItemType type, String name, String fabric, String color) {
        this.name = name;
        this.type = type;
        this.fabric = fabric;
        this.color = color;
        this.secondaryColor = null;
    }

    public Item(ItemType type, String name, String fabric, String color, String secondaryColor) {
        this.name = name;
        this.type = type;
        this.fabric = fabric;
        this.color = color;
        this.secondaryColor = secondaryColor;
    }

    public boolean isAccesory() {
        return this.type == ItemType.ACCESSORY;
    }

    public boolean isUpperClothing() {
        return this.type == ItemType.UPPER_CLOTHING;
    }

    public boolean isLowerClothing() {
        return this.type == ItemType.LOWER_CLOTHING;
    }

    public boolean isFootWear() {
        return this.type == ItemType.FOOTWEAR;
    }

    public String name() {
        return this.name;
    }
}
