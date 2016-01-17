package com.grandhunterman.dnvm.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class ConfigHandler {
    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);


        try {
            configuration.load();


        } catch (Exception e) {

        } finally {
            configuration.save();
        }
    }
}
