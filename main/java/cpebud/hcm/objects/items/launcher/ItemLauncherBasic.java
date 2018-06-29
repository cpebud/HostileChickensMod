package cpebud.hcm.objects.items.launcher;

import cpebud.hcm.objects.items.ItemBase;
import cpebud.hcm.util.interfaces.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class ItemLauncherBasic extends ItemBase implements IHasModel
{
	ItemStackHandler inventory;
	
	public ItemLauncherBasic(String name)
	{
		super(name);
		this.setMaxStackSize(1);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack stackToSaveTo = playerIn.getHeldItem(handIn);
		
		if(playerIn.isSneaking() && inventory == null)
		{
			inventory = (ItemStackHandler) initCapabilities(stackToSaveTo, null).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);	
		}
		
		NBTTagCompound nbt = new NBTTagCompound();
		inventory.deserializeNBT(nbt);
		
		return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	}
	
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
	{
		inventory.serializeNBT();
	}
	
	@Override
	public ICapabilityProvider initCapabilities(ItemStack item, NBTTagCompound nbt)
	{
		if(item.getItem() instanceof ItemLauncherBasic)
		{
			return new LauncherBasicCapabilityProvider();
		}
		return null;
	}
	
	public static class LauncherBasicCapabilityProvider implements ICapabilityProvider, ICapabilitySerializable
	{
		@Override
		public NBTBase serializeNBT()
		{
			return null;
		}
		
		@Override
		public void deserializeNBT(NBTBase nbt)
		{
			
		}
		
		@Override 
		public boolean hasCapability(Capability<?> capability, EnumFacing facing)
		{
			if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			{
				return true;
			}
			return false;
		}
		
		@Override
		public <T> T getCapability(Capability<T> capability, EnumFacing facing)
		{
			if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			{
				return (T) new ItemStackHandler(6);
			}
			return null;
		}
	}
}
