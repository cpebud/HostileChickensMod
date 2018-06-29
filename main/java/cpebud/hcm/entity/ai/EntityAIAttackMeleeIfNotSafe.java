package cpebud.hcm.entity.ai;

import cpebud.hcm.entity.EntityChickenBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.passive.EntityAnimal;

public class EntityAIAttackMeleeIfNotSafe extends EntityAIAttackMelee
{
	protected EntityChickenBase attackingChicken;
	public EntityAIAttackMeleeIfNotSafe (EntityChickenBase chicken, double speedIn, boolean useLongMemory)
	{
		super(chicken, speedIn, useLongMemory);
		this.attackingChicken = chicken;
	}

	public boolean shouldExecute()
	{
		boolean safe = this.attackingChicken.isSafe();
		return safe ? false : super.shouldExecute();
	}
}
