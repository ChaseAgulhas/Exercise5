package com.chase.services.Impl;

import com.chase.domain.ItemData;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class BagelItemImpl implements ItemInterface {
    public ItemData getItemData() {
        ItemData itemData = new ItemData();
        itemData.setItemCode("bread01");
        itemData.setName("Bagel");
        itemData.setQuantity(7);
        return itemData;
    }
}