package test.mod.item;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import test.mod.block.BlockLoader;
import test.mod.util.Reference;

/**
 * a class to load items
 */
@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ItemLoader
{
	public static ItemStackHolder itemStackHolder = new ItemStackHolder();
	
	public ItemLoader()
	{
		ForgeRegistries.ITEMS.register(itemStackHolder);
		ForgeRegistries.ITEMS.register(new ItemBlock(BlockLoader.pipe).setRegistryName("testmod", "pipe"));
	}
	
//	@SubscribeEvent
//    public void registerItem(RegistryEvent.Register<Item> event)
//    {
//		event.getRegistry().register(itemStackHolder);
//		event.getRegistry().register(new ItemBlock(BlockLoader.pipe).setRegistryName("testmod", "pipe"));
//    }
}