package com.grandhunterman.dnvm.block;

import com.grandhunterman.dnvm.block.ore.BlockAluminumOre;
import com.grandhunterman.dnvm.block.ore.BlockCopperOre;
import com.grandhunterman.dnvm.block.ore.BlockTitaniumOre;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.grandhunterman.dnvm.block.ore.BlockCopperOre.*;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class InitBlock {

    public static BlockTitaniumOre blockTitaniumOre;
    public static BlockAluminumOre blockAluminumOre;
    public static BlockCopperOre blockCopperOre;

    public static void init() {
        blockTitaniumOre = new BlockTitaniumOre();
        blockAluminumOre = new BlockAluminumOre();
        blockCopperOre = new BlockCopperOre();

    }

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        blockCopperOre.InitModel();
        blockTitaniumOre.InitModel();
    }

}
