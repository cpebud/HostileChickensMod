package cpebud.hcm.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

/*
 * Copied from Ellpeck with ActuallyAdditions. Currently not being used.
 */
public abstract class GuiWtfMojang extends GuiContainer
{
	public GuiWtfMojang(Container inventorySlotsIn)
	{
		super(inventorySlotsIn);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		this.drawDefaultBackground();
		this.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
}
