package com.grandhunterman.dnvm;

import com.grandhunterman.dnvm.block.InitBlock;
import com.grandhunterman.dnvm.common.organization.CreativeTab;
import com.grandhunterman.dnvm.config.ConfigHandler;
import com.grandhunterman.dnvm.item.InitItem;
import com.grandhunterman.dnvm.reference.LogHelper;
import com.grandhunterman.dnvm.reference.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = "com.grandhunterman.dnvm.client.GuiFactory.class")
public class DNVM
{


    @EventHandler
    public void  init(FMLPreInitializationEvent event){
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigHandler());
        proxy.preInit(event);
        LogHelper.info("Testing 123");

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLPostInitializationEvent event){

    }

    public static final CreativeTab tabDNVM = new CreativeTab("tabDNVM");


   //Random Proxy Shit

    @SidedProxy
    public static CommonProxy proxy;

    public static class CommonProxy{
        public void preInit(FMLPreInitializationEvent event){
            InitItem.init();
            InitBlock.init();
        }
        public void Init(FMLInitializationEvent event){

        }

        public void postInit(FMLPostInitializationEvent event){

        }

    }
    public static class ClientProxy extends CommonProxy{
        @Override
        public void preInit(FMLPreInitializationEvent event){
            super.preInit(event);
            InitBlock.initModels();
            InitItem.initModels();
        }

    }
    public static class ServerProxy extends CommonProxy{
        @Override
        public void preInit(FMLPreInitializationEvent event){
            super.preInit(event);
        }
    }
}
