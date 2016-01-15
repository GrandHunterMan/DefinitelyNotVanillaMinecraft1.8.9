package com.grandhunterman.dnvm.block.ore;

import com.grandhunterman.dnvm.block.BlockBase;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class BlockAluminumOre extends BlockBase {
    public BlockAluminumOre(){
        super();
        setUnlocalizedName("blockAluminumOre");
        setRegistryName("blockAluminumOre");
        GameRegistry.registerBlock(this);
    }
}
