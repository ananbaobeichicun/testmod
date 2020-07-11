package test.mod.tileentity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import test.mod.Reference;

public class TileentityLoader
{
	public TileentityLoader()
	{
		GameRegistry.registerTileEntity(GrinderTileEntity.class, new ResourceLocation(Reference.MODID, "Drainer"));
	}
}
