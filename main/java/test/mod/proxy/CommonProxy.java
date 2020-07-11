package test.mod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import test.mod.inventory.GuiElementLoader;
import test.mod.tileentity.TileentityLoader;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		new TileentityLoader();
	}
	
	public void init(FMLInitializationEvent event)
	{
		new GuiElementLoader();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
	
	}
}