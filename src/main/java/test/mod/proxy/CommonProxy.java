package test.mod.proxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import test.mod.MyEvent;
import test.mod.MyForgeEventHandler;
import test.mod.item.ItemStackHolder;
import test.mod.util.Reference;

@Mod.EventBusSubscriber
public class CommonProxy
{
	@GameRegistry.ObjectHolder(Reference.MODID + ":pipe")
	public static Block pipe = new Block(Material.ROCK).setCreativeTab(CreativeTabs.MATERIALS).setUnlocalizedName("pipe").setRegistryName("testmod", "pipe");

	@GameRegistry.ObjectHolder(Reference.MODID + ":stack_holder")
	public static ItemStackHolder itemStackHolder = new ItemStackHolder();

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(pipe);
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(itemStackHolder);

		event.getRegistry().register(new ItemBlock(pipe).setRegistryName(Reference.MODID, "pipe"));
	}

	public void preInit(FMLPreInitializationEvent event)
	{
		;
		for (int i = 0; i < 10; i++)
		{
			new MyEvent();
		}
		new MyForgeEventHandler();
	}

	public void init(FMLInitializationEvent event)
	{

	}

	public void postInit(FMLPostInitializationEvent event)
	{

	}
}