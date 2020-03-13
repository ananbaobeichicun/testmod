package test.mod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import test.mod.block.BlockLoader;
import test.mod.item.ItemLoader;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	new ItemLoader();
    	new BlockLoader();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}