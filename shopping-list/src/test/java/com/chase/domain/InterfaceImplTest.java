package com.chase.domain;

import com.chase.services.Impl.BagelItemImpl;
import com.chase.services.Impl.ChickenItemImpl;
import com.chase.services.Impl.ItemInterfaceImpl;
import com.chase.services.Impl.TomatoItemImpl;
import com.chase.services.ItemInterface;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/13.
 */
public class InterfaceImplTest {
    private ItemInterface item;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testItemInterfaceImpl() throws Exception {
        item = new ItemInterfaceImpl();
        System.out.println(item.getItemData() + "");
    }

    @Test
    public void testBagelItem() throws Exception {
        item = new BagelItemImpl();
        System.out.println(item.getItemData() + "");
    }

    @Test
    public void testChickenItem() throws Exception {
        item = new ChickenItemImpl();
        System.out.println(item.getItemData() + "");
    }

    @Test
    public void testTomatoItem() throws Exception {
        item = new TomatoItemImpl();
        System.out.println(item.getItemData() + "");
    }
}
