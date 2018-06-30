package cpebud.hcm.objects.items.launcher.slots;

import cpebud.hcm.objects.blocks.BlockEggGiantOverworld;
import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotEggGiantOverworld extends SlotItemHandler
{
	private final ItemStackHandler inv;
	public SlotEggGiantOverworld(ItemStackHandler inv, int index, int x, int y)
	{
		super(inv, index, x, y);
		this.inv = inv;
	}

	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return Block.getBlockFromItem(stack.getItem()) instanceof BlockEggGiantOverworld;
	}
	
	@Override
	public int getSlotStackLimit()
	{
		return 1;
	}
}
