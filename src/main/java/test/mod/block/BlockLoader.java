package test.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import test.mod.util.Reference;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class BlockLoader
{
	public static Block pipe = new Block(Material.ROCK).setCreativeTab(CreativeTabs.MATERIALS)
			.setUnlocalizedName("pipe").setRegistryName("testmod", "pipe");
	
	public BlockLoader()
	{
		ForgeRegistries.BLOCKS.register(pipe);
	}
	
	@SubscribeEvent
	public void registerBlock(RegistryEvent.Register<Block> event)
	{
		System.out.println("-----------------------------------------------------------------------------------------------");
		event.getRegistry().register(pipe);
	}
}