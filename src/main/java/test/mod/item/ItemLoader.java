package test.mod.item;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import test.mod.item.ItemStackHolder;
import test.mod.util.Reference;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ItemLoader
{
	public static ItemStackHolder itemStackHolder;
    ItemLoader()
    {
    	ForgeRegistries.ITEMS.register(itemStackHolder);
    }
}