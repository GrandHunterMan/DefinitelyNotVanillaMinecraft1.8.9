package com.grandhunterman.dnvm.common.organization;

import com.grandhunterman.dnvm.item.InitItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class CreativeTab extends CreativeTabs {
    public CreativeTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return InitItem.itemTitaniumIngot;
    }
}
