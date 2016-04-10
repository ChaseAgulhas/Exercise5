package com.chase.services.Impl;

import com.chase.domain.ItemData;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class ItemInterfaceImpl implements ItemInterface {
    public ItemData getItemData() {
        ItemData itemData = new ItemData();
        itemData.setItemCode("gen01");
        itemData.setName("Generic");
        itemData.setQuantity(1);
        return itemData;
    }
}
