package test.mod.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import test.mod.TestMod;
import test.mod.inventory.GuiElementLoader;
import test.mod.tileentity.GrinderTileEntity;

public class BlockGrinder extends BlockContainer
{
	public BlockGrinder()
	{
		super(Material.ROCK);//todo: 改
		this.setUnlocalizedName("block_grinder")
				.setRegistryName("block_grinder");
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (! worldIn.isRemote)
		{
			playerIn.openGui(TestMod.instance, GuiElementLoader.Grinder, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new GrinderTileEntity();
	}
}
