package test.mod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import test.mod.Reference;
import test.mod.block.BlockLoader;

@EventBusSubscriber
public class ItemLoader
{
	@GameRegistry.ObjectHolder(Reference.MODID + ":stack_holder")
	public static ItemStackHolder itemStackHolder = new ItemStackHolder();
	public static Item itemPipe = new ItemBlock(BlockLoader.pipe).setUnlocalizedName("pipe")
			.setRegistryName(Reference.MODID, "pipe");
	
	public static Item ingot_copper = new Item().setUnlocalizedName("ingot_copper")
			.setRegistryName(Reference.MODID, "ingot_copper");
	public static Item plate_copper = new Item().setUnlocalizedName("plate_copper")
			.setRegistryName(Reference.MODID, "plate_copper");
	public static Item coil_copper = new Item().setUnlocalizedName("coil_copper")
			.setRegistryName(Reference.MODID, "coil_copper");
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry()
				.registerAll(itemPipe);
		event.getRegistry()
				.registerAll(ingot_copper, plate_copper, coil_copper);
		event.getRegistry()
				.registerAll(itemStackHolder);
	}
}
