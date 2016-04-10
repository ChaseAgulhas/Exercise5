package com.chase.services.Impl;

import com.chase.domain.ItemData;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class ChickenItemImpl implements ItemInterface {
    public ItemData getItemData() {
        ItemData itemData = new ItemData();
        itemData.setItemCode("meat01");
        itemData.setName("Chicken");
        itemData.setQuantity(6);
        return itemData;
    }
}