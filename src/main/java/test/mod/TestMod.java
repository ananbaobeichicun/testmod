package test.mod;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import test.mod.proxy.CommonProxy;
import test.mod.util.Reference;

/*
 *todo: 虚空垃圾箱
 *
 *
 */

@Mod (modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TestMod
{
	@Instance (Reference.MODID)
	public static TestMod instance;
	
	@SidedProxy (clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	@SubscribeEvent
	public void registerBlocks (RegistryEvent.Register <Block> event)
	{
		System.out.println ("dddddddddddddddddddddddddddddddddddd");
		//		event.getRegistry().register(pipe);
	}
	
	@EventHandler
	public static void preInit (FMLPreInitializationEvent event)
	{
		proxy.preInit (event);
	}
	
	@EventHandler
	public static void init (FMLInitializationEvent event)
	{
		proxy.init (event);
	}
	
	@EventHandler
	public static void postInit (FMLPostInitializationEvent event)
	{
		proxy.postInit (event);
	}
}
