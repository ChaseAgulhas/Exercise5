package com.chase.conf;

import com.chase.services.Impl.BagelItemImpl;
import com.chase.services.Impl.ChickenItemImpl;
import com.chase.services.Impl.ItemInterfaceImpl;
import com.chase.services.Impl.TomatoItemImpl;
import com.chase.services.ItemInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by student on 2016/04/10.
 */
@Configuration
@Scope()
public class ItemConfig {
    @Bean(name= "generic")
    @Scope("singletone")
    public ItemInterface getGeneric()
    {
        return new ItemInterfaceImpl();
    }

    @Bean(name="tomato")
    public ItemInterface getTomato()
    {
        return new TomatoItemImpl();
    }

    @Bean(name="bagel")
    public ItemInterface getBagel()
    {
        return new BagelItemImpl();
    }

    @Bean(name="chicken")
    public ItemInterface getChicken()
    {
        return new ChickenItemImpl();
    }

}
