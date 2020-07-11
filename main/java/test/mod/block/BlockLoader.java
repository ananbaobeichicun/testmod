package test.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import test.mod.Reference;

@EventBusSubscriber
public class BlockLoader
{
	@GameRegistry.ObjectHolder(Reference.MODID + ":pipe")
	public static Block pipe = new Block(Material.ROCK).setCreativeTab(CreativeTabs.MATERIALS)
			.setUnlocalizedName("pipe")
			.setRegistryName(Reference.MODID, "pipe");
	public static Block grinder = new BlockGrinder();
	
	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry()
				.registerAll(pipe, grinder);
	}
}
