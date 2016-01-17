package com.grandhunterman.dnvm.block.ore;

import com.grandhunterman.dnvm.block.BlockBase;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class BlockSilverOre extends BlockBase {
    public BlockSilverOre(){
        super();
        setUnlocalizedName("blockSilverOre");
        setRegistryName("blockSilverOre");
        GameRegistry.registerBlock(this);

    }

    @SideOnly(Side.CLIENT)
    public void InitModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
