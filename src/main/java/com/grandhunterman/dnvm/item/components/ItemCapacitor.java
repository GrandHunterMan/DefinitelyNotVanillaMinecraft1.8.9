package com.grandhunterman.dnvm.item.components;

import com.grandhunterman.dnvm.item.ItemBase;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class ItemCapacitor extends ItemBase {
    public ItemCapacitor(){
        super();
        setUnlocalizedName("itemCapacitor");
        setRegistryName("itemCapacitor");
        GameRegistry.registerItem(this);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
