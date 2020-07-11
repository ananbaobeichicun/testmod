package test.mod.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import test.mod.tileentity.GrinderTileEntity;

public class ContainerGrinder extends Container
{
	protected GrinderTileEntity tileEntity;
	
	public ContainerGrinder(EntityPlayer player, TileEntity tileEntity)
	{
		super();
		this.tileEntity = (GrinderTileEntity) tileEntity;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn)
	{
		return playerIn.getDistanceSq(tileEntity.getPos()) <= 64;
	}
}
