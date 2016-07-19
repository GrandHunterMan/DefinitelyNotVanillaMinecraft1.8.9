package com.grandhunterman.dnvm.item;

import com.grandhunterman.dnvm.item.Ingots.*;
import com.grandhunterman.dnvm.item.components.ItemBasicCircuit;
import com.grandhunterman.dnvm.item.components.ItemCapacitor;
import com.grandhunterman.dnvm.item.components.ItemResistor;
import com.grandhunterman.dnvm.item.components.ItemSwitch;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class InitItem {

        //Base Resources
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

        //Electronic Gear
    public static ItemResistor itemResistor;
    public static ItemCapacitor itemCapacitor;
    public static ItemSwitch itemSwitch;
    public static ItemBasicCircuit itemBasicCircuit;


    public static void init() {
            //Basic Resources
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

            //Electronic Gear
        itemResistor = new ItemResistor();
        itemCapacitor = new ItemCapacitor();
        itemSwitch = new ItemSwitch();
        itemBasicCircuit = new ItemBasicCircuit();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels(){
            //Basic Resources
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

            //Electronic Gear
        itemResistor.initModel();
        itemCapacitor.initModel();
        itemSwitch.initModel();
        itemBasicCircuit.initModel();
    }
}

