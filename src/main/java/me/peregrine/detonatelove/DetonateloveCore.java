package me.peregrine.detonatelove;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(name = "DetonateLoveMod", modid = "me.peregrine.detonatelove", version = "1.0.0")
public class DetonateloveCore {
    @Instance("me.peregrine.detonatelove")
    public static DetonateloveCore instance;

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){

    }

}