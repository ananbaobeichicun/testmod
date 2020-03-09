package test.mod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import test.mod.item.ItemLoader;

//@Mod.EventBusSubscriber(value = Side.CLIENT, modid = "testmod")
//public final class ModelMapper
//{
//    @SubscribeEvent
//    public static void onModelReg(ModelRegistryEvent event)
//    {
//    	ModelLoader.setCustomModelResourceLocation(ItemLoader.itemStackHolder, 0, new ModelResourceLocation(ItemLoader.itemStackHolder.getRegistryName(), "inventory"));
//    }
//}