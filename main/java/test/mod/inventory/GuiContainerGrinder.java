package test.mod.inventory;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import test.mod.Reference;

public class GuiContainerGrinder extends GuiContainer
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(
			Reference.MODID + ":textures/gui/container/grinder.png");
	protected ContainerGrinder container;
	
	public GuiContainerGrinder(ContainerGrinder inventorySlotsIn)
	{
		super(inventorySlotsIn);
		container = inventorySlotsIn;
		xSize = 176;
		ySize = 166;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		mc.getTextureManager()
				.bindTexture(TEXTURE);
		drawTexturedModalRect(width - xSize >> 1, height - ySize >> 1, 0, 0, xSize, ySize);
	}
}
