package test.mod.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import test.mod.TestMod;

public class GuiElementLoader implements IGuiHandler
{
	public static final int Grinder = 1;
	
	public GuiElementLoader()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(TestMod.instance, this);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch (ID)
		{
			case Grinder:
				return new ContainerGrinder(player, world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch (ID)
		{
			case Grinder:
				return new GuiContainerGrinder(
						new ContainerGrinder(player, world.getTileEntity(new BlockPos(x, y, z))));
		}
		return null;
	}
}
