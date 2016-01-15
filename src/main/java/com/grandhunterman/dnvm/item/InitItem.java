package com.grandhunterman.dnvm.item;

import com.grandhunterman.dnvm.item.Ingots.ItemTitaniumIngot;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class InitItem {

    public static ItemTitaniumIngot itemTitaniumIngot;

    public static void init() {
        itemTitaniumIngot = new ItemTitaniumIngot();
    }

    @SideOnly(Side.CLIENT)
    public void initModels(){
        itemTitaniumIngot.initModel();
    }
}

