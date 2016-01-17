package com.grandhunterman.dnvm.block;

import com.grandhunterman.dnvm.block.ore.*;
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
    public static BlockTinOre blockTinOre;
    public static BlockSilverOre blockSilverOre;
    public static BlockLeadOre blockLeadOre;
    public static BlockChromeOre blockChromeOre;
    public static BlockCryoliteOre blockCryoliteOre;
    public static BlockRutileOre blockRutileOre;
    public static BlockNickelOre blockNickelOre;
    public static BlockPlatinumOre blockPlatinumOre;


    public static void init() {
        blockTitaniumOre = new BlockTitaniumOre();
        blockAluminumOre = new BlockAluminumOre();
        blockCopperOre = new BlockCopperOre();
        blockTinOre = new BlockTinOre();
        blockSilverOre = new BlockSilverOre();
        blockLeadOre = new BlockLeadOre();
        blockChromeOre = new BlockChromeOre();
        blockRutileOre = new BlockRutileOre();
        blockCryoliteOre = new BlockCryoliteOre();
        blockNickelOre = new BlockNickelOre();
        blockPlatinumOre = new BlockPlatinumOre();

    }

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        blockCopperOre.InitModel();
        blockTitaniumOre.InitModel();
        blockAluminumOre.InitModel();
        blockTinOre.InitModel();
        blockSilverOre.InitModel();
        blockLeadOre.InitModel();
        blockChromeOre.InitModel();
        blockRutileOre.InitModel();
        blockCryoliteOre.InitModel();
        blockNickelOre.InitModel();
        blockPlatinumOre.InitModel();
    }

}
