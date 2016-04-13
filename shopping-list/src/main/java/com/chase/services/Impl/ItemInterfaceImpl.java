package com.chase.services.Impl;

import com.chase.domain.*;
import com.chase.services.ItemInterface;

/**
 * Created by student on 2016/04/10.
 */
public class ItemInterfaceImpl implements ItemInterface {

    /*private static ItemInterfaceImpl generic;

    private ItemInterfaceImpl(){}

    public static ItemInterfaceImpl getObjectInstance()
    {
        return new ItemInterfaceImpl();
    }*/

    public ItemData getItemData(){
        ItemData itemData = new ItemData.Builder()
                .setItemCode("gen01")
                .setName("Generic")
                .setQuantity(1)
                .build();
        return itemData;
    }
}
