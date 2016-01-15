package com.grandhunterman.dnvm.item;

import com.grandhunterman.dnvm.DNVM;
import com.grandhunterman.dnvm.common.organization.CreativeTab;
import net.minecraft.item.Item;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class ItemBase extends Item {
    public ItemBase(){
        super();
        setCreativeTab(DNVM.tabDNVM);
        this.maxStackSize = 64;
    }
}
