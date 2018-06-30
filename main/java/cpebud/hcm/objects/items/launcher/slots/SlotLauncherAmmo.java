package cpebud.hcm.objects.items.launcher.slots;

import cpebud.hcm.objects.items.eggs.ItemEggBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotLauncherAmmo extends SlotItemHandler
{
	private final ItemStackHandler inv;

	public SlotLauncherAmmo(ItemStackHandler inv, int index, int x, int y)
	{
		super(inv, index, x, y);
		this.inv = inv;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return stack.getItem() instanceof ItemEggBase;
	}

	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return super.getItemStackLimit(stack);
	}
}
