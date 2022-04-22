package com.grm.qmp.domain;

import com.github.javafaker.Faker;
import com.grm.qmp.domain.wardrobe.Item;
import com.grm.qmp.domain.wardrobe.ItemType;

public class ItemMother {

    public static Item accessory() {
        Faker faker = new Faker();

        return new Item(ItemType.ACCESSORY, "gorro", "lana", faker.color().name());
    }

    public static Item upperClothing() {
        Faker faker = new Faker();

        return new Item(ItemType.UPPER_CLOTHING, "remera", "algodon", faker.color().name());
    }

    public static Item lowerClothing() {
        Faker faker = new Faker();

        return new Item(ItemType.LOWER_CLOTHING, "pantalon", "jean", faker.color().name());
    }

    public static Item footWear() {
        Faker faker = new Faker();

        return new Item(ItemType.FOOTWEAR, "zapatos", "cuero", faker.color().name());
    }
}
