package com.grm.qmp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.grm.qmp.domain.ItemMother;
import com.grm.qmp.domain.user.User;
import com.grm.qmp.domain.wardrobe.Item;
import com.grm.qmp.domain.wardrobe.NoItemsException;
import com.grm.qmp.domain.wardrobe.Outfit;
import com.grm.qmp.domain.wardrobe.Wardrobe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestSuite;

class QmpApplicationTests extends TestSuite {

    @AfterEach
    private void cleanWardrobe() {
        Wardrobe.getInstance().clean();
    }

    @Test
    void successGeneratingOutfit() throws NoItemsException {

        Item expectedAccessory = ItemMother.accessory();
        Item expectedUpperClothing = ItemMother.upperClothing();
        Item expectedLowerClothing = ItemMother.lowerClothing();
        Item expectedFootWear = ItemMother.footWear();

        User user = new User();
        user.addItemToWardrobe(expectedAccessory);
        user.addItemToWardrobe(expectedUpperClothing);
        user.addItemToWardrobe(expectedLowerClothing);
        user.addItemToWardrobe(expectedFootWear);

        Outfit outfit = Wardrobe.getInstance().generateOutfit();

        assertSame(expectedAccessory, outfit.accesory());
        assertSame(expectedUpperClothing, outfit.upperClothing());
        assertSame(expectedLowerClothing, outfit.lowerClothing());
        assertSame(expectedFootWear, outfit.footWear());
    }

    @Test
    void failOnNonSufficientItems() throws NoItemsException {

        Item expectedAccessory = ItemMother.accessory();
        Item expectedLowerClothing = ItemMother.lowerClothing();
        Item expectedFootWear = ItemMother.footWear();

        User user = new User();
        user.addItemToWardrobe(expectedAccessory);
        user.addItemToWardrobe(expectedLowerClothing);
        user.addItemToWardrobe(expectedFootWear);

        assertThrows(NoItemsException.class,
                () -> Wardrobe.getInstance().generateOutfit());
    }
}
