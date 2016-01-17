package com.grandhunterman.dnvm.block;

import com.grandhunterman.dnvm.DNVM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class BlockBase extends Block{
    public BlockBase(){
        super(Material.rock);
        this.setCreativeTab(DNVM.tabDNVM);

    }
}
