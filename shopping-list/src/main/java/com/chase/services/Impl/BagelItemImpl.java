package com.chase.services.Impl;

import com.chase.domain.ItemData;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class BagelItemImpl implements ItemInterface {
    public ItemData getItemData() {
        ItemData itemData = new ItemData.Builder()
        .setItemCode("bread01")
        .setName("Bagel")
        .setQuantity(7).build();
        return itemData;
    }
}