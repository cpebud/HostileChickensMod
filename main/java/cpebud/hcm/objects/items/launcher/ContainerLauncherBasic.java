package cpebud.hcm.objects.items.launcher;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerLauncherBasic extends Container
{
	private final ItemLauncherBasic launcher;
	
	public ContainerLauncherBasic(InventoryPlayer player, ItemLauncherBasic launcher)
	{
		this.launcher = launcher;
		this.addSlotToContainer(new SlotItemHandler((IItemHandler) launcher, 0, 128, 34));
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn)
	{
		return true;
	}

}
