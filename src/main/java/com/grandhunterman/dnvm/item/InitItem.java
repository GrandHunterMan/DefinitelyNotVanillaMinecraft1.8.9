package com.grandhunterman.dnvm.item;

import com.grandhunterman.dnvm.item.Ingots.*;
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
    public static ItemAluminumIngot itemAluminumIngot;
    public static ItemCopperIngot itemCopperIngot;
    public static ItemChromeIngot itemChromeIngot;
    public static ItemSilverIngot itemSilverIngot;
    public static ItemCryoliteGem itemCryoliteGem;
    public static ItemLeadIngot itemLeadIngot;
    public static ItemTinIngot itemTinIngot;
    public static ItemNickelIngot itemNickelIngot;
    public static ItemPlatinumIngot itemPlatinumIngot;
    public static ItemRutileGem itemRutileGem;


    public static void init() {
        itemTitaniumIngot = new ItemTitaniumIngot();
        itemAluminumIngot = new ItemAluminumIngot();
        itemCopperIngot = new ItemCopperIngot();
        itemChromeIngot = new ItemChromeIngot();
        itemSilverIngot = new ItemSilverIngot();
        itemCryoliteGem =  new ItemCryoliteGem();
        itemLeadIngot = new ItemLeadIngot();
        itemTinIngot = new ItemTinIngot();
        itemNickelIngot = new ItemNickelIngot();
        itemPlatinumIngot = new ItemPlatinumIngot();
        itemRutileGem = new ItemRutileGem();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        itemTitaniumIngot.initModel();
        itemAluminumIngot.initModel();
        itemCopperIngot.initModel();
        itemChromeIngot.initModel();
        itemSilverIngot.initModel();
        itemCryoliteGem.initModel();
        itemLeadIngot.initModel();
        itemTinIngot.initModel();
        itemNickelIngot.initModel();
        itemPlatinumIngot.initModel();
        itemRutileGem.initModel();
    }
}

