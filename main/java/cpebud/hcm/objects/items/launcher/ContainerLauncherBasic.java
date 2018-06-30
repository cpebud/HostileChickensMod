package cpebud.hcm.objects.items.launcher;

import cpebud.hcm.objects.items.launcher.slots.SlotEggGiantOverworld;
import cpebud.hcm.objects.items.launcher.slots.SlotLauncherAmmo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerLauncherBasic extends Container
{
	public static final int SLOT_AMOUNT = 6;
	
	private final ItemStackHandler invLauncher = new ItemStackHandler(SLOT_AMOUNT);
	private final InventoryPlayer inventory;
	
	public ContainerLauncherBasic(InventoryPlayer inventory)
	{
		this.inventory = inventory;
		
		this.addSlotToContainer(new SlotEggGiantOverworld(this.invLauncher, 5, 128, 35));
		
		for(int x = 0; x < 5; x++)
		{
			this.addSlotToContainer(new SlotLauncherAmmo(this.invLauncher, x, 8 + x*18, 35));
		}
		
		/*
		 * Regular player inventory.
		 */
		for(int y = 0; y < 3; y++)
		{
			for(int x = 0; x < 9; x++)
			{
				this.addSlotToContainer(new Slot(inventory, x + y*9 + 9, 8 + x*18, 84 + y*18));
			}
		}
		
		for(int x = 0; x < 9; x++)
		{
			this.addSlotToContainer(new Slot(inventory, x, 8 + x * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn)
	{
		return true;
	}

}
