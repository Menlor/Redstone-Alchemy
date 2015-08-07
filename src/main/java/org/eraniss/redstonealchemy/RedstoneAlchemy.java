package org.eraniss.redstonealchemy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.eraniss.redstonealchemy.init.ModItems;
import org.eraniss.redstonealchemy.proxy.IProxy;
import org.eraniss.redstonealchemy.reference.Reference;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)

public class RedstoneAlchemy {
    @Mod.Instance(Reference.MOD_ID)
    public static RedstoneAlchemy instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent inEvent)  {
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent inEvent)  {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent inEvent)  {

    }
}
