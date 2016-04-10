package com.chase.services.Impl;

import com.chase.domain.ItemData;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class TomatoItemImpl implements ItemInterface {
    public ItemData getItemData() {
        ItemData itemData = new ItemData();
        itemData.setItemCode("veg01");
        itemData.setName("Tomato");
        itemData.setQuantity(5);
        return itemData;
    }
}
