package com.grandhunterman.dnvm.block.ore;

import com.grandhunterman.dnvm.block.BlockBase;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.tools.nsc.doc.model.Public;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class BlockCopperOre extends BlockBase {

    public BlockCopperOre() {
        super();
        setUnlocalizedName("blockCopperOre");
        setRegistryName("blockCopperOre");
        GameRegistry.registerBlock(this);
    }


    @SideOnly(Side.CLIENT)
    public void InitModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
