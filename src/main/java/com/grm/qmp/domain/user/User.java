package com.grm.qmp.domain.user;

import com.grm.qmp.domain.wardrobe.Item;
import com.grm.qmp.domain.wardrobe.Wardrobe;

public class User {

    public void addItemToWardrobe(Item item) {
        Wardrobe.getInstance().addItem(item);
    }

}
