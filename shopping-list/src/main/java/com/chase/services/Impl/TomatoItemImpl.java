package com.chase.services.Impl;

import com.chase.domain.ItemData;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class TomatoItemImpl implements ItemInterface {
    public ItemData getItemData() {
        ItemData itemData = new ItemData.Builder()
        .setItemCode("veg01")
        .setName("Tomato")
        .setQuantity(5).build();
        return itemData;
    }
}
