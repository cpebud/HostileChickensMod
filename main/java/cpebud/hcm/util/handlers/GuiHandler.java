package cpebud.hcm.util.handlers;

import cpebud.hcm.objects.items.launcher.ContainerLauncherBasic;
import cpebud.hcm.objects.items.launcher.GuiLauncherBasic;
import cpebud.hcm.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_LAUNCHER_BASIC) return new ContainerLauncherBasic(player.inventory);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_LAUNCHER_BASIC) return new GuiLauncherBasic(player.inventory);
		return null;
	}
	
}
