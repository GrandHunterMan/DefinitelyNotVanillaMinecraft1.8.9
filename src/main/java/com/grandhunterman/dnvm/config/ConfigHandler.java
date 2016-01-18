package com.grandhunterman.dnvm.config;

import com.grandhunterman.dnvm.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2016  GrandHunterMan (http://www.grandhunterman.com)
 */
public class ConfigHandler {

    public static Configuration configuration;
    public static boolean testValue = false;




    public static void init(File configFile) {



        if(configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }


    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }
    }


    private static void loadConfiguration(){
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Test");

        if(configuration.hasChanged()){
            configuration.save();
        }
    }

}
