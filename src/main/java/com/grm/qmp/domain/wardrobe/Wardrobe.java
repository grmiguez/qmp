package com.grm.qmp.domain.wardrobe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Wardrobe {

    private static Wardrobe instance;
    private List<Item> items;

    private Wardrobe() {
        this.items = new ArrayList<>();
    }

    public static Wardrobe getInstance() {

        if (instance == null) {
            instance = new Wardrobe();
        }

        return instance;
    }

    public List<Item> items() {
        return this.items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Outfit generateOutfit() throws NoItemsException {

        return new Outfit(
                getRandomItem(this.accesories()),
                getRandomItem(this.upperClothings()),
                getRandomItem(this.lowerClothings()),
                getRandomItem(this.footWears()));
    }

    private List<Item> accesories() {
        return this.items.stream()
                .filter(Item::isAccesory)
                .collect(Collectors.toList());
    }

    private List<Item> upperClothings() {
        return this.items.stream()
                .filter(Item::isUpperClothing)
                .collect(Collectors.toList());
    }

    private List<Item> lowerClothings() {
        return this.items.stream()
                .filter(Item::isLowerClothing)
                .collect(Collectors.toList());
    }

    private List<Item> footWears() {
        return this.items.stream()
                .filter(Item::isFootWear)
                .collect(Collectors.toList());
    }

    // No hay una estategia determinada para combinar prendas, por lo que elijo
    // randomizar la selección
    private Item getRandomItem(List<Item> items) throws NoItemsException {
        Random rand = new Random();

        if (items.isEmpty()) {
            throw new NoItemsException();
        }

        return items.get(rand.nextInt(items.size()));
    }

    public void clean() {
        this.items.clear();
    }
}
