package test.mod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import test.mod.item.ItemLoader;

@EventBusSubscriber(value = Side.CLIENT)
public final class ModelMapper
{
	@SubscribeEvent
	public static void onModelRegisters(ModelRegistryEvent event)
	{
		ModelLoader.setCustomModelResourceLocation(ItemLoader.ingot_copper, 0,
				new ModelResourceLocation(ItemLoader.ingot_copper.getRegistryName(), "inventory"));
	}
}
