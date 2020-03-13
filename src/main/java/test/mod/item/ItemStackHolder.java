package test.mod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemStackHolder extends Item
{
	public ItemStackHolder()
	{
		super();
		this.setUnlocalizedName("stack_holder")
        .setCreativeTab(CreativeTabs.MATERIALS)
        .setRegistryName("testmod", "item_stack_holder");
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
//		playerIn.openGui(TestMod.instance, 5, worldIn, 0, 0, 0);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItemMainhand());
	}
}